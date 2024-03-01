# Simple Unix File System Simulator: Bridging Theory and Practice in File System Management

## Abstract

Our Simple Unix File System Simulator is written in Java. It is an educational tool designed to emulate Unix file system operations. This simulator aims to provide practical experience in understanding how operating system concepts work.

File management has always been a fundamental part of operating systems that we use daily, but the underlying mechanisms of file management systems have always remained opaque. By simulating the functionalities of the Unix file system, including file creation, deletion, manipulation, navigation, and so on, we want to demystify this intriguing system. We believe this would enhance our learning in the operating system significantly.

We will build this project with a goal in mind. When someone uses our project to do some typical file operations, we will show the underlying mechanisms behind them at the same time, which are in most cases hidden from everyday users of operating systems such as ourselves. This way, users gain a comprehensive understanding of what happens "under the hood." Our project thus serves as a bridge between theoretical knowledge and practical application. By providing this clarity, we aspire to foster a deeper curiosity and appreciation for the intricacies of operating systems among OS students.

## Brief Project Description

This project offers a hands-on approach to learning about Unix file systems by simulating common operations within a binary file used as a virtual disk. Developed in Java 17 for Windows environments, it features a user-friendly command-line interface, allowing users to execute file operations, understand data organization, and explore file system architecture's impact on efficiency and reliability in real-world applications. Its most unique feature is its ability to show the hidden mechanisms behind each user-initiated operation on the command-line interface.

## Requirements Definition Document

### 1. Introduction

#### 1.1 Purpose

The document aims to give some details about the requirements for the Simple Unix File System Simulator. Using Java, this simulator demonstrates Unix file system operations by showing the user the hidden mechanisms behind each user-initiated operation via a command-line interface.

#### 1.2 Scope

The simulator enables the user to perform fundamental file and directory operations using a binary file to emulate disk storage. The operations might include most common ones such as directory creation and removal, content listing, directory navigation, file copying, deletion, etc. And we will try our best to show the users what is behind all these operations and what is concurrently happening under the hood.

### 2. Overall Description

#### 2.1 Product Perspective

This simulator is a standalone Java application. It is tailored for Windows.

#### 2.2 Product Functions

Key functions include:
- File System Creation: Initiate a new file system within a virtual disk.
- Directory and File Operations: Create, delete, list, and modify files and directories.
- File Import/Export: Facilitate the transfer of files between the simulated system and the user's machine.

#### 2.3 User Classes and Characteristics

Designed for educators, students, and developers

#### 2.4 Operating Environment

Compatible with Windows, requiring Java 17 and Maven

#### 2.5 Design and Implementation Constraints

Because this is a simple course project, we want to do our best to show the mechanisms behind directory operations. Due to limitations in time and resources, performance and scalability might not be so good, so the project is for education purposes only.

### 3. System Features

#### 3.1 File System Simulation

The system simulates a Unix file system using a binary file as a container.
Requirements:
  - The system must allow users to specify the path and size of the container file.
  - The system must be able to split the container file into blocks to simulate disk segmentation.

#### 3.2 File and Directory Management

Users can perform basic file and directory operations similar to a Unix file system.
Requirements:
  - Support for creating, removing, listing, and navigating directories.
  - Support for file operations such as copying, removing, viewing, and writing.

#### 3.3 File Import/Export (Optional)

The system allows users to import files from their machine into the simulated file system and export files back to their machine.
Requirements:
  - The system can provide commands for importing and exporting files.
  - The system can handle file path specifications for import/export operations.

#### 3.4 User Interaction

The system provides an interface for users to interact with the simulated file system through commands.
Requirements:
  - The system must accept and process a pre-defined set of commands entered by the user (e.g. mkdir, rmdir, ls, cd...).
  - The system must provide feedback and results of command execution.

#### 3.5 Mechanism Insights

Simultaneously show the underlying processes involved in file and directory operations when performed by the user.
Requirements:
- For directory operations (create, remove, list, navigate), display the Unix file system's steps for managing directory structure and metadata.
- For file operations (copy, remove, view, write), illustrate how the Unix file system handles file data, allocation, and metadata updates.

### 4. External Interface Requirements

#### 4.1 User Interfaces

The system provides a command-line interface for user interaction.
Requirements:
  - The interface must display prompts for user input.
  - The interface must display the results of command executions.

#### 4.2 Software Interfaces

The system is built using Java 17 and requires Maven for building.
Requirements:
  - Java 17 runtime environment must be installed on the user's machine.
  - Maven (or provided Maven wrapper) must be available for building the project.

### 5. Other Nonfunctional Requirements (Optional)

Non-functional requirements include response time, file security, error handling, clear command syntax, and so on. But, again, due to limited time and resources, these functionalities may or may not be implemented.

### 6. Conclusion

This Requirement Definition Document outlines the essential requirements for the Unix File System Simulator. The simulator serves as an educational tool, allowing users to explore and understand the concepts of a Unix file system through practical simulation.
