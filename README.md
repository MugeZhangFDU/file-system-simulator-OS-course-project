# Simple Unix File System Simuilator

---

## Overview
A Unix file system simulator, written in Java. This file system uses some of the simpler data structures, used in file systems, including:
- Index nodes
- Super block
- Data blocks
- Bitmaps and others.

---

## How it works
This implementation uses a single binary file, which is used as a container for the file system. The binary file is treated just like a hard drive would be treated by a file system - it gets split into blocks, each with the same size, which allows for allocation/deletion and segmentation of the disk for the different types of data that need to be stored.

### File structures

#### Super block
The super block structure contains metadata about the file system. The system can refer to it for any information about itself, such as:
- The amount of bytes each block takes
- The total amount of blocks in the container
- The maximum size of the container in bytes
- The offsets in blocks for the different segments of the disk.

#### Bitmaps
Bitmaps serve as a way to map bits to blocks in the index node/data block region. For the needs of the system, 1 means the block is allocated (taken), 0 means the block is unallocated (free).

#### Index nodes
Index nodes are a combination of metadata about a file (or directory, they are also treated as files) and a collection of pointers to blocks in the data block region. Each pointer in the direct block list points to a data block on the disk. Whenever a user wants, for example, to read a file, the file system takes all the blocks and concatenates them together to represent the file, which isn't actually saved contiguously. Note, this file system uses index nodes with a list of regular direct pointers, which point directly to data blocks. There are possible implementations of signle, double, triple etc. indirect blocks, in which each pointer in the list points to another list of pointers and so on. This allows a single file to be much larger, as with the current implementation each file can have up to 56 allocated direct blocks, which, after some calculations results in a 28,672 bytes, or 28 kilobytes of maximum file size (which, obviously, is really small for today's standarts).

#### Data blocks
Data blocks are used to store the raw data of the files. These are the blocks referenced by index nodes.

---
### Disk segmentation
Whenever the file system is created, it gets separated into different regions, or segments, for each type of file structure. This is done by calculating the offset for each region, based on the size of the file system provided before creation. The existing regions are (NOTE, the default block size is 512 bytes):
- Super block region - 1 block. Then, the total amount of blocks is calculated, and based on it, the system calculates the offsets for:
- Index node bitmap region - bitmaps for the index node region
- Data block bitmap region - bitmaps for the data block region
- Index node region - stores the index node blocks
- Data block region - stores the raw data blocks

### File system commands

#### Command reference
The system supports some of the basic Unix file system commands, such as:
-  `mkdir` - creates a directory
-  `rmdir` - removes a directory
-  `ls` - lists the content inside the current directory
-  `cd` - changes the directory
-  `cp` - copies a file
-  `rm` - removes a file
-  `cat` - shows the content of a file
-  `write` - writes to a new/existing file
-  `import` - imports a file from the user's machine
-  `export` - exports a file from the simulated file system to the user's machine
-  `help` - lists the usages of all commands.
  
#### Command usages:
Whenever the app starts, the user can execute the `help` command to see the usages of all commands:
- `mkdir`: `mkdir <dir_name>`
- `rmdir`: `rmdir`
- `ls`: `ls`
- `cd`: `cd <name>` or `cd <name1/name2/...>` or `cd ..` for parent dir or `cd /` for root dir
- `cp`: `cp <source_name> <dest_name>`
- `rm`: `rm <file_name>`
- `cat`: `cat <file_name>`
- `write`: `write <file_name> "<content>"` or `write +append <file_name> "<content>"`
- `import`: `import <ext_path> <file_name>` or `import +append <ext_path> <file_name> \"<content>\""`
- `export`: `export <file_name> <ext_path>`

---

## Installation guide

  
