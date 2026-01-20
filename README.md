# Employee Resource Manager (ERM) — Phase 1.1: The Refactor

A refined Java implementation transitioning from procedural logic to **Domain-Driven Design**. This phase focuses on **Separation of Concerns** by introducing a dedicated manager layer.

---

## The Quick Start (ABC)

This system now operates through a service-based architecture, separating the "how" from the "what."

* **The Goal:** Decouple data storage from business logic.
* **The Mechanism:** A new `EmployeeManager` class (The Service Layer) that handles all list operations and search algorithms.
* **The Result:** A modular structure where `Main.java` only handles high-level execution, not low-level logic.

---

##  How to Run

1.  **Compile:** ```bash
    javac Main.java Employee.java EmployeeManager.java
    ```
2.  **Execute:** ```bash
    java Main
    ```
3.  **Interact:** View the automated search testing and employee directory in the console output.

---

## Deep Dive: Architecture & Strategy

### The DAO Pattern (Data Access Object)
We have introduced a simplified **DAO-style** pattern. The `EmployeeManager` class acts as the gatekeeper for the `ArrayList`, ensuring that all data manipulation (adding, searching, and eventually deleting) happens in one centralized location.



### Components
* **The Model (Employee.java):** Purely for data definition. No logic, just encapsulation.
* **The Service (EmployeeManager.java):** Contains the "Search Engine" and collection management.
* **The Entry Point (Main.java):** Acts as the system orchestrator, initializing the manager and triggering events.

---

## NOTE: Design Decisions

* **Linear Search:** For **v1.1**, we implemented a `for-each` loop to find employees by ID. While simple, it is highly effective for the current memory-based state.
* **Parameter Type Safety:** We utilize specific object parameters (`Employee emp`) in our manager methods to prevent type errors and ensure data integrity.

---

## Project Roadmap: The "Tune-Up"

This is **Phase 1.1** of a multi-part series. We have accelerated the "Search" feature from Phase 3 into the current build.

1.  **Phase 1:** Core OOP & CLI. (Completed)
2.  **Phase 1.1 (Current):** **The Refactor.** Implementing the `EmployeeManager` class and Search logic.
3.  **Phase 2 (Next):** **Data Cleanup.** Adding "Delete" functionality using Java Lambdas and `removeIf` logic.
4.  **Phase 3:** **File Persistence.** Implementing logic to save/load employees from a `.csv` file.
5.  **Phase 4:** **Database Integration.** Moving to a SQL-based persistent storage.

---

##  References & Best Practices
* **Separation of Concerns (SoC):** By splitting logic into three files, we ensure that changing the search algorithm doesn't require changing the `Employee` model.
* **KISS Principle:** Keeping it Simple, Stupid. We are using standard Java collections