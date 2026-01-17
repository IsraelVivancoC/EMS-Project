import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        
        
        ArrayList<Employee> employeesList = new ArrayList<>();

        employeesList.add(new Employee(001, "Israel V", "DevOps", 27000.00));
        employeesList.add(new Employee(002, "Lola B", "C. Success", 25000.00));
        employeesList.add(new Employee(003, "Javi G", "Sales", 40000.00));

        System.out.println("Welcome to this provisional Employee Management System v1.0 ");
        
        
        System.out.println("----------------------------------------------------------------");

        for (Employee emp : employeesList){
            System.out.println(emp);
        }
        
        System.out.println("----------------------------------------------------------------------");
    }
}