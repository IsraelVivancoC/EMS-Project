# Employee Resource Manager (ERM) — Phase 3.0: Interactive CLI

This version transforms the system from a static script into a fully interactive **Command Line Interface (CLI)** application, allowing real-time data management.

---

## The Quick Start (ABC)

v3.0 introduces the `java.util.Scanner` implementation, enabling a dynamic loop where the user controls the application life cycle.

* **The Goal:** Create a user-friendly interface for data entry and manipulation.
* **The Mechanism:** A `while-switch` control structure paired with a `Scanner` buffer manager.
* **The Result:** A live application where employees can be added, searched, and deleted without restarting the program.

---

##  How to Run

1.  **Compile:** ```bash
    javac Main.java Employee.java EmployeeManager.java
    ```
2.  **Execute:** ```bash
    java Main
    ```
3.  **Interact:** Use the numeric menu (1-5) to manage your workforce directly from the terminal.

---

## Deep Dive: Architecture & Strategy

### The Scanner & Buffer Management
Interactive Java programs often suffer from "input skipping." In v3.0, we implemented **Buffer Cleaning** using `reader.nextLine()` after every `nextInt()` or `nextDouble()`. This ensures that the "Enter" key stroke doesn't interfere with subsequent text inputs.



### Control Flow
The application now uses a **State-Machine** approach:
* **Running State:** The `while(running)` loop keeps the process alive in RAM.
* **Input State:** The `switch(choice)` blocks execution until a user provides a valid command.
* **Exit State:** Choice `5` triggers the cleanup and termination of the JVM process.

---

## NOTE: Design Decisions

* **User Experience (UX):** We added clear console labels (e.g., "Enter ID to find:") to guide the user through the process.
* **Input Validation:** The `default` case in our switch statement handles "fat-finger" errors, preventing the program from crashing if an invalid number is entered.

---

## Project Roadmap: The "Tune-Up"

1.  **Phase 1 - 2.0:** Core OOP and Logic implementation. (Completed)
2.  **Phase 3.0 (Current):** **Interactive CLI.** Full Scanner integration and Menu system.
3.  **Phase 4.0 (Next):** **File Persistence.** Implementing `java.io` to save the `ArrayList` to a `.csv` or `.txt` file so data survives a restart.

---

##  References & Best Practices
* **State Management:** Using a boolean flag to control the main loop is a standard pattern for CLI tools.
* **Resource Management:** Utilizing `reader.close()` to prevent memory leaks in the Java Virtual Machine.