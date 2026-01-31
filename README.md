# Employee Management System (EMS) — Phase 4.0: File Persistence & Service Architecture

This version marks a major milestone: the transition from a volatile "in-memory" script to a persistent **Data-Driven Application**. The system now ensures that no data is lost when the application is terminated.

---

##  Upgrade: Persistence (v4.0)

v4.0 introduces the `java.io` implementation, moving the project into the "The Tune-Up" stage where data lives on the disk, not just in RAM.

* **The Goal:** Ensure data integrity across multiple application lifecycles.
* **The Mechanism:** A **Service-Oriented Architecture (SOA)** where `EmployeeService` handles the bridge between the logic and the `employees.csv` file.
* **The Result:** A professional-grade CLI where every addition or deletion is instantly synchronized with a physical database file.

---

##  How to Run

1.  **Structure Check:** Ensure your files are in their respective folders (`model/` and `service/`).
2.  **Compile:**
    ```bash
    javac model/Employee.java service/EmployeeService.java Main.java
    ```
3.  **Execute:**
    ```bash
    java Main
    ```
4.  **Persistence Check:** After closing the app, look for `employees.csv` in your root directory. Your data is safe!

---

## 🛠 Deep Dive: Architecture & Engineering

### 1. Service Layer Pattern
We refactored `EmployeeManager` into `EmployeeService`. This follows the **Single Responsibility Principle (SRP)**:
- **Main:** Handles only user interaction (UI).
- **EmployeeService:** Handles business logic and file I/O operations.
- **Employee:** A pure POJO (Plain Old Java Object) representing the data model.

### 2. File I/O & Serialization

We implemented manual serialization to CSV format:
- **Writing:** Using `PrintWriter` and `FileWriter` to "flush" the List to the disk.
- **Reading:** Using `BufferedReader` and `FileReader` to reconstruct Java Objects from raw text lines during startup.

### 3. Smart ID Management
To prevent ID collisions after a restart, the system now implements an **Auto-Increment Logic**. Upon startup, it scans the existing CSV file to determine the `lastId`, ensuring every new employee receives a unique, sequential identifier.

---

##  Project Roadmap: The "Data-Centric" Evolution

1.  **Phase 1.0 - 2.0:** Core OOP and Logic implementation. (Completed)
2.  **Phase 3.0:** Interactive CLI (Scanner integration). (Completed)
3.  **Phase 4.0 (Current):** **File Persistence.** Robust CSV storage and Service Layer refactor.
4.  **Phase 5.0 (Next):** **Search & Sort Algorithms.** Implementing advanced filtering by Department and Salary sorting.

---

##  Design Decisions & Best Practices
* **Encapsulation:** All file operations are `private` within the Service, exposing only clean business methods to the `Main` class.
* **Resilience:** The system checks for the existence of `employees.csv` before reading. If it's missing, it gracefully creates a new environment instead of crashing.
* **Scalability:** By using a `.csv` format, the data is now portable and can be opened in Excel or migrated to a SQL Database in the future.

---
*Developed as part of the professional software engineering blueprint series.*