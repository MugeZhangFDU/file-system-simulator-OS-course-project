# Requirement Definition Document for Simple Unix File System Simulator

## 1. Introduction

### 1.1 Purpose
The purpose of this document is to outline the requirements for the Simple Unix File System Simulator. This simulator aims to provide an educational tool that demonstrates the workings of a Unix file system through simulation, using Java 17. It is intended for users who wish to understand file system concepts such as index nodes, super blocks, data blocks, and bitmaps.

### 1.2 Scope
The Simple Unix File System Simulator will simulate a Unix file system using a single binary file as a container to mimic a hard drive. The simulator will support basic file system operations such as creating directories, removing directories, listing contents, changing directories, copying files, removing files, displaying file contents, writing to files, importing files from the user's machine, and exporting files to the user's machine.

## 2. Overall Description

### 2.1 Product Perspective
The product is a standalone application developed in Java 17, designed to run on Windows environments. It simulates a Unix file system's behavior, providing an interactive interface for users to execute file system commands.

### 2.2 Product Functions
- **File System Creation:** Users can create a new file system by specifying a path and size for the container file.
- **Directory Operations:** Users can create and remove directories.
- **File Operations:** Users can list directory contents, change directories, copy, remove, view, and write to files.
- **File Import/Export:** Users can import files from their machine into the simulated file system and export files from the simulated file system to their machine.
- **Command Help:** Users can view a list of all available commands and their usages.

### 2.3 User Classes and Characteristics
- **Educators and Students:** Individuals seeking to understand the inner workings of Unix file systems through practical simulation.
- **Software Developers:** Developers interested in file system concepts or developing file system-related applications.

### 2.4 Operating Environment
The simulator is designed to run on Windows operating systems. It requires Java 17 and Maven for building the project.

### 2.5 Design and Implementation Constraints
- The simulator is implemented in Java 17, limiting its performance and scalability compared to a native Unix file system.
- The maximum file size is constrained by the implementation of index nodes and the size of the container file specified by the user.

## 3. System Features

### 3.1 File System Simulation
- **Description:** The system simulates a Unix file system using a binary file as a container.
- **Requirements:**
  - The system must allow users to specify the path and size for the container file.
  - The system must split the container file into blocks to simulate disk segmentation.

### 3.2 File and Directory Management
- **Description:** Users can perform basic file and directory operations similar to a Unix file system.
- **Requirements:**
  - Support for creating, removing, listing, and navigating directories.
  - Support for file operations such as copying, removing, viewing, and writing.

### 3.3 File Import/Export
- **Description:** The system allows users to import files from their machine into the simulated file system and export files back to their machine.
- **Requirements:**
  - The system must provide commands for importing and exporting files.
  - The system must handle file path specifications for import/export operations.

### 3.4 User Interaction
- **Description:** The system provides an interface for users to interact with the simulated file system through commands.
- **Requirements:**
  - The system must accept and process commands entered by the user.
  - The system must provide feedback and results of command execution.
  - The system must support some of the basic Unix file system commands, such as:
     - mkdir - creates a directory
     - rmdir - removes a directory
     - ls - lists the content inside the current directory
     - cd - changes the directory
     - cp - copies a file
     - rm - removes a file
     - cat - shows the content of a file
     - write - writes to a new/existing file
     - import - imports a file from the user's machine
     - export - exports a file from the simulated file system to the user's machine
     - help - lists the usages of all commands.

## 4. External Interface Requirements

### 4.1 User Interfaces
- **Description:** The system provides a command-line interface for user interaction.
- **Requirements:**
  - The interface must display prompts for user input.
  - The interface must display the results of command executions.

### 4.2 Software Interfaces
- **Description:** The system is built using Java 17 and requires Maven for building.
- **Requirements:**
  - Java 17 runtime environment must be installed on the user's machine.
  - Maven (or provided Maven wrapper) must be available for building the project.

## 5. Other Nonfunctional Requirements

### 5.1 Performance Requirements
- The system should respond to user commands within a reasonable time frame, not exceeding 2 seconds for any operation.

### 5.2 Security Requirements
- As a simulation tool, the system does not require encryption or advanced security measures. However, file import/export operations should ensure that file paths are validated to prevent directory traversal attacks.

### 5.3 Software Quality Attributes
- **Reliability:** The system should handle errors gracefully, providing meaningful error messages to the user.
- **Usability:** The system should be easy to use, with clear command syntax and helpful documentation.
- **Maintainability:** The code should be well-organized and documented to facilitate future enhancements and bug fixes.

## 6. Conclusion
This Requirement Definition Document outlines the essential requirements for the Simple Unix File System Simulator. The simulator serves as an educational tool, allowing users to explore and understand the concepts of a Unix file system through practical simulation.
