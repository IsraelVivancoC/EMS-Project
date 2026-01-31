import model.Employee;
import service.EmployeeService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeService service = new EmployeeService();
        Scanner sc = new Scanner(System.in);
        int option;

        do {
            System.out.println("\n--- EMS Project (Fase 2: Persistencia) ---");
            System.out.println("1. Agregar Empleado");
            System.out.println("2. Listar Empleados (desde CSV)");
            System.out.println("3. Eliminar Empleado");
            System.out.println("0. Salir");
            System.out.print("Selección: ");
            option = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (option) {
                case 1:
                    System.out.print("Nombre: "); String n = sc.nextLine();
                    System.out.print("Depto: "); String d = sc.nextLine();
                    System.out.print("Salario: "); double s = sc.nextDouble();
                    service.addEmployee(n, d, s);
                    break;
                case 2:
                    service.getAllEmployees().forEach(System.out::println);
                    break;
                case 3:
                    System.out.print("ID a borrar: ");
                    service.deleteEmployee(sc.nextInt());
                    break;
            }
        } while (option != 0);
    }
}