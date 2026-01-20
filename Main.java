import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        
    	EmployeeManager manager = new EmployeeManager();

        manager.addEmployee(new Employee(001,"Israel V", "DevOps", 27000.00));
        manager.addEmployee(new Employee(002, "Lola B", "C. Success", 25000.00));
        manager.addEmployee(new Employee(003, "Javi G", "Sales", 40000.00));

        System.out.println("Welcome to this provisional Employee Management System v1.1 ");
        
        
        System.out.println("----------------------------------------------------------------");
        
        
        manager.displayAll();
        
        System.out.println("Searching testing");
        
        manager.findById(001);
        manager.findById(003);
        
        
        
        
        System.out.println("----------------------------------------------------------------------");
    }
}