# Simple Unix File System Simulator

## Abstract

Our Simple Unix File System Simulator, written in Java, serves as an educational tool to emulate Unix file system operations. The simulator provides practical experience in understanding operating system concepts, demystifying the underlying mechanisms of file management. By simulating Unix file system functionalities, including creation, deletion, manipulation, and navigation, we aim to bridge the gap between theory and practice, enhancing learning in operating systems.

## Brief Project Description

This project offers a hands-on approach to learning about Unix file systems by simulating common operations within a binary file used as a virtual disk. Developed in Java 17 for Windows environments, it features a user-friendly command-line interface, allowing users to execute file operations, understand data organization, and explore file system architecture's impact on efficiency and reliability in real-world applications. Its unique feature is revealing hidden mechanisms behind each user-initiated operation on the command-line interface.

## Requirements Definition Document

### 1. Introduction

#### 1.1 Purpose

This document details the requirements for the Simple Unix File System Simulator, a Java-based tool demonstrating Unix file system operations by revealing hidden mechanisms through a command-line interface.

#### 1.2 Scope

The simulator enables users to perform fundamental file and directory operations using a binary file to emulate disk storage. It aims to demystify these operations and provide insights into concurrent processes.

### 2. Overall Description

#### 2.1 Product Perspective

The simulator is a standalone Java application tailored for Windows.

#### 2.2 Product Functions

Key functions include:
- File System Creation
- Directory and File Operations
- File Import/Export

#### 2.3 User Classes and Characteristics

Designed for educators, students, and developers.

#### 2.4 Operating Environment

Compatible with Windows, requiring Java 17 and Maven.

#### 2.5 Design and Implementation Constraints

Due to time and resource constraints, performance and scalability may be limited, focusing on educational purposes.

### 3. System Features

#### 3.1 File System Simulation

- Users can specify the path and size of the container file.
- The system can split the container file into blocks to simulate disk segmentation.

#### 3.2 File and Directory Management

- Support for creating, removing, listing, and navigating directories.
- Support for file operations such as copying, removing, viewing, and writing.

#### 3.3 File Import/Export (Optional)

- Users can import/export files between the simulated system and their machine.

#### 3.4 User Interaction

- Command-line interface for user interaction.
- Accept and process a predefined set of commands.
- Provide feedback on command execution.

#### 3.5 Mechanism Insights

- Simultaneously show underlying processes involved in file and directory operations.

### 4. External Interface Requirements

#### 4.1 User Interfaces

- Command-line interface displaying prompts and results.

#### 4.2 Software Interfaces

- Built using Java 17 and requires Maven for building.

### 5. Other Nonfunctional Requirements (Optional)

Due to limited time and resources, non-functional requirements may not be fully implemented.

### 6. Conclusion

This Requirement Definition Document outlines essential requirements for the Unix File System Simulator, an educational tool providing practical simulation for understanding Unix file system concepts.
