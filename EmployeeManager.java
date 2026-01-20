import java.util.ArrayList;

public class EmployeeManager {
	private ArrayList<Employee> employeesList;
	
	public EmployeeManager() {
		this.employeesList = new ArrayList<>();
	}
	
	public void addEmployee(Employee emp) {
		this.employeesList.add(emp);
	}
	
	//here we're about to define our "search engine"
	
	public void findById(int id) {
		for (Employee emp : employeesList) {
			if(emp.getId() == id) {
				System.out.println("Result founded -> " + emp);
				return;
			}
		}
		System.out.println("Id not found, " + id + " is not in the system.");
	}
	
	public void displayAll() {
		for (Employee emp : employeesList) {
		System.out.println(emp);
		}
	}
	
	public void deleteById(int id) {
		boolean removed = employeesList.removeIf(emp -> emp.getId()==id);
		
		if(removed) {
			System.out.println("Employee with ID : " + id + ", has been removed.");
		} else {
			System.out.println("Error! No employee found with ID:  " + id + " Nothing eas deleated. " );
		}
		
	}
}
