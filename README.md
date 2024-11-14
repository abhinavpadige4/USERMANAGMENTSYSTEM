# Bank User Management System

This project is a **User Management System** for a bank, implemented in Java with a unique file-based storage system instead of a traditional database. This makes it lightweight and suitable for environments where database access may not be feasible.

## Features

- **Create User**: Allows new users to register, saving their data to files.
- **User Login**: Enables secure login with data retrieved from file storage.
- **Read and Write Operations**: Supports reading from and writing to files, allowing user data to be updated or accessed as required.
- **Delete File Content**: Users can clear the content of their file without deleting the file itself.
- **Delete User File**: Users can choose to delete their file completely, removing all stored data.

## Project Structure

- **`Main.java`**: The main driver class for running the application.
- **`Login.java`**: Manages user login functionality.
- **`Delete.java`**: Handles file deletion options, including clearing content or deleting files entirely.
- **`Create.java`**: Responsible for creating new user files and managing user registration.

## How It Works

1. **File-Based Storage**: Stores each user’s data in individual files for simple data handling.
2. **Java File Handling**: Utilizes Java’s file I/O API to manage user data securely and efficiently.
3. **User-Friendly Operations**:
   - **Create and Login**: Register and authenticate users directly through file I/O.
   - **Read and Write**: Provides file-based access and modification options.
   - **Delete Options**: Users can choose between clearing content or full deletion.

## Getting Started

1. Clone the repository:
   ```bash
   git clone https://github.com/abhinavpadige4/usermanagementsystem.git
   ```
2. Compile and run the application:
   ```bash
   javac Main.java
   java Main
   ```

## Requirements

- **Java 8 or above**: Ensure Java is installed on your system.

## Contributing

Contributions are welcome! Please feel free to open issues, submit pull requests, or suggest improvements.

