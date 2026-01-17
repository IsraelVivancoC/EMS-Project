public class Employee {
    // 1. Private attributes (Encapsulation)
    private int id;
    private String name;
    private String department;
    private double salary;

    // 2. Constructor (To create an employee object)
    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // 3. Getters (To read the data)
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getDepartment() {
        return department;
    }
    public double getSalary() {
        return salary;
    }

    // 4. Setters (To update data with validation)
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Error- Salary must be positive");
        }
    }

    // 5. toString (To print employee info easily)
    @Override
    public String toString() {
        return String.format("ID: %d | Name: %-15s | Dept: %-10s | Salary: $%.2f",
                id, name, department, salary);
    }
}