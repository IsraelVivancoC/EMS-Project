# Employee Resource Manager (ERM) — Phase 2.0: Data Cleanup

This version marks the transition to **Modern Java (JDK 8+)** features, focusing on efficient data manipulation and the implementation of the "Delete" lifecycle.

---

## The Quick Start (ABC)

With the foundation and search engine built, v2.0 focuses on maintaining a healthy dataset by allowing record removal.

* **The Goal:** Implement a safe and efficient way to remove records from memory.
* **The Mechanism:** Using **Lambda Expressions** and the `removeIf` predicate to avoid `ConcurrentModificationException`.
* **The Result:** A CRUD-capable (Create, Read, Update, Delete) management system that handles dynamic data changes.

---

##  How to Run

1.  **Compile:** ```bash
    javac Main.java Employee.java EmployeeManager.java
    ```
2.  **Execute:** ```bash
    java Main
    ```
3.  **Interact:** Observe the console output as the system removes a record (ID: 2) and refreshes the directory.

---

## Deep Dive: Architecture & Strategy

### Modern Functional Programming
Instead of using the classic **Iterator Pattern** (which requires manual cursor management), we utilized **Functional Interfaces**. 



The `removeIf` method takes a "Predicate" (a true/false condition). As Java iterates through the `ArrayList`, it applies our lambda `emp -> emp.getId() == id` to each element. If the condition is true, the element is removed safely.

### Why not a standard For-loop?
Standard loops fail during removal because the list's size changes while the index is still moving. By using `removeIf`, we let the Java Collections Framework handle the structural changes safely.

---

## NOTE: Design Decisions

* **Boolean Feedback:** The `deleteById` method now returns (or prints) a status message. This is crucial for **User Experience (UX)** so the user knows if the operation succeeded or if the ID was invalid.
* **Lambda vs. Iterator:** We chose Lambdas for v2.0 to keep the codebase concise and readable, following modern industry standards.

---

## Project Roadmap: The "Tune-Up"

1.  **Phase 1 & 1.1:** Core OOP, Service Layer, and Search Logic. (Completed)
2.  **Phase 2.0 (Current):** **Data Cleanup.** Implementation of Delete functionality.
3.  **Phase 2.1 (Next):** **Interactive CLI.** Implementing `java.util.Scanner` to allow real-time user input.
4.  **Phase 3:** **File Persistence.** Moving from RAM to `.csv` storage.

---

##  References & Best Practices
* **DRY (Don't Repeat Yourself):** Logic is kept strictly within the `EmployeeManager`.
* **Clean Code:** Methods are small, focused, and named according to their specific action.