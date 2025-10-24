
# Notes-Manager

A simple command-line application to create and manage text-based notes using Java File I/O.
This program allows users to add and read notes stored in a local file, providing a basic example of file persistence using `FileWriter` and `BufferedReader`.

---

# Features

➡ Add new text notes and save them to a file (`notes.txt`)  
➡ View all previously saved notes  
➡ Notes are persisted — they remain even after the program exits  
➡ Continuous, menu-driven interface using loops  
➡ Uses simple and clean console interaction  
➡ Demonstrates Java File I/O (read/write) concepts

---


# How to Run

1. **Make sure you have Java installed** on your computer.
2. Save the code in a file called `NotesManager.java`.
3. Open your **terminal** or **command prompt**.
4. Navigate to the folder where you saved the file.
5. **Compile** the program using the command:

   ```bash
   javac NotesManager.java
   ```
6. **Run** the program using the command:

   ```bash
   java NotesManager
   ```

---

# Program Description

This application allows the user to manage notes through a text-based menu:

1️ **Add Note** – Lets the user write a note and saves it in `notes.txt`  
2️ **Read Notes** – Displays all notes previously saved in the file  
3️ **Exit** – Ends the program

The file `notes.txt` is automatically created in the same directory if it doesn’t already exist.
Each note is appended to the file so previous notes are not lost.

---
