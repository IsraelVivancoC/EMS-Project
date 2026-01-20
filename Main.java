import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
        Scanner reader = new Scanner(System.in); // Our new "ear" to hear the user
        boolean running = true;

        System.out.println("Welcome to ERM v3.0");

        
        while (running) {
            System.out.println("\n___________EMPLOYEE MANAGEMENT SYSTEM_________");
            System.out.println("1. Add Employee");
            System.out.println("2. Search by ID");
            System.out.println("3. Delete Employee");
            System.out.println("4. Display All");
            System.out.println("5. Exit");
            System.out.println("Choose an option: ");
            System.out.println("__________________________________________________");
            
            int choice = reader.nextInt();
            reader.nextLine(); // Remember to clean the scanner(buffer)
            
        switch (choice) {
        case 1: // ADD
            System.out.print("Enter ID: ");
            int id = reader.nextInt();
            reader.nextLine(); // cleaning buffer
            System.out.print("Enter Name: ");
            String name = reader.nextLine();
            System.out.print("Enter Dept: ");
            String dept = reader.nextLine();
            System.out.print("Enter Salary: ");
            double salary = reader.nextDouble();
            
            manager.addEmployee(new Employee(id, name, dept, salary));
            System.out.println("Employee added successfully!");
            break;

        case 2: 
            System.out.print("Enter ID to search: ");
            reader.nextLine(); // Buffer cleanup
            int searchId = reader.nextInt();
            manager.findById(searchId);
            break;

        case 3: 
            System.out.print("Enter ID to delete: ");
            int delId = reader.nextInt();
            reader.nextLine(); // Buffer cleanup
            manager.deleteById(delId);
            break;

        case 4: 
            manager.displayAll();
            break;

        case 5: 
            running = false;
            break;

        default:
            System.out.println("Invalid option, try again.");
    }
        }
        System.out.println("Goodbye!");
        reader.close(); // Always close your scanner!
    }
}