import java.util.ArrayList;

public class Main {
    static void main(String[] args) {
        // we need to creaate
        ArrayList<Employees> employeesList = new ArrayList<>();

        //let's adda some data why not

        employeesList.add(new Employee(001, "Israel V", "DevOps", 27000.00));
        employeesList.add(new Employee(002, "Lola B", "Costumer Success", 25000.00));
        employeesList.add(new Employee(003, "Javi G", "Sales", 40000.00));

        System.out.println("Welcome to this provisional Employee Management System v1.0 ");
        System.out.println(+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++);

        //fix: for a moment I forget to add the dot toString function
        for (Employee emp : employeesList){
            System.out.println(emp);
        }
        System.out.println(+-++-+-+-+-+-++-+-++-+-+-++-++++-++-+-+-+-++-+-+-+-+-+-+-+-+-+-+-+-+-);
    }
}