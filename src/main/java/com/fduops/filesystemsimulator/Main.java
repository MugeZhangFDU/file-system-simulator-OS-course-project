package com.fduops.filesystemsimulator;

import java.util.Scanner;

import com.fduops.filesystemsimulator.exceptions.FileSystemException;
import com.fduops.filesystemsimulator.parser.OptionParser;
import com.fduops.filesystemsimulator.filesystem.FileSystem;

public class Main {

	private static final Scanner INPUT = new Scanner(System.in);

	public static void main(String[] args) {
		FileSystem fileSystem = null;
		OptionParser optionParser;

		System.out.println("----- Simplified UNIX file system simulator -----");
		String path;
		long size = 0;
		try {
			do {
				System.out.print("Enter the path to the container file: ");
				path = INPUT.nextLine();
			} while ("".equals(path));
			do {
				System.out.print("Enter the maximum file system size in bytes: ");
				String input = INPUT.nextLine();
				try {
					size = Long.parseLong(input);
				} catch (NumberFormatException e) {
					System.out.println("Invalid size!");
				}
			} while (size == 0);
			fileSystem = new FileSystem(path, size);
		} catch (FileSystemException e) {
			System.out.println("ERROR - " + e.getMessage());
		}
		optionParser = new OptionParser(fileSystem);
		boolean running = true;
		System.out.println("Type \"help\" for information on all available commands.");
		while (running) {
			System.out.print(fileSystem.getSystemPath() + "> ");
			if (optionParser.executeCommand(INPUT.nextLine())) {
				running = false;
			}
		}
	}
}
