# Employee Resource Manager (ERM) — Phase 1: The Foundation

A foundational Java implementation for corporate workforce management. This project focuses on **Encapsulation** and **State Management** to handle sensitive employee data securely.

---

## The Quick Start (ABC)

This system acts as a digital filing cabinet for a company's most important asset: its people.

* **The Goal:** Transition from "loose variables" to structured **Objects**.
* **The Mechanism:** A dedicated `Employee` class that protects data using `private` access modifiers (Encapsulation).
* **The Result:** A clean, reusable blueprint that ensures data integrity (e.g., preventing negative salaries).

---

## 🚀 How to Run

1.  **Compile:** ```bash
    javac Main.java Employee.java
    ```
2.  **Execute:** ```bash
    java Main
    ```
3.  **Interact:** Follow the terminal prompts to create your first organizational record.

---

## Deep Dive: Architecture & Strategy

### Real-World Use Case
In a corporate environment, data cannot be "flat." You must associate names with unique IDs to avoid collisions between employees with the same name. By using **Object-Oriented Programming (OOP)**, we ensure that an "Employee" is a complete package of both data and logic.

### Components
* **The Model (Employee.java):** The "Blueprint." It defines what an employee *is* (ID, Name, Dept, Salary).
* **The Controller (Main.java):** The "Brain." It handles user input and manages the collection of employees.
* **Encapsulation:** By making fields `private`, we prevent external code from corrupting data. Access is only granted through controlled "Getters" and "Setters."



---

## NOTE: Design Decisions

* **ArrayList vs. Arrays:** We chose `ArrayList` for version 1.0 because it is **dynamic**. Unlike standard arrays, the list grows automatically as the company hires new staff.
* **Memory State:** Currently, data lives in **RAM**. If the program closes, the data is wiped. Solving this is the primary goal for Phase 2.

---

## Project Roadmap: The "Tune-Up"

This is **Phase 1** of a multi-part series on building enterprise-grade software.

1.  **Phase 1 (Current):** Core OOP & CLI. Manual data entry and memory-based storage.
2.  **Phase 2 (Coming):** **File Persistence.** Implementing logic to save/load employees from a `.csv` file.
3.  **Phase 3 (Advanced):** **Search & Sort.** Implementing algorithms to filter by Department or sort by Seniority.
4.  **Phase 4 (Expert):** **Interface & Database.** Moving from a console to a SQL Database.

---

##  References & Best Practices
* **SOLID Principles:** This project aims to follow the **Single Responsibility Principle**.