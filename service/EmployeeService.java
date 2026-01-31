package service;


import model.Employee;
import java.io.*;
import java.util.*;

public class EmployeeService {
    private List<Employee> employeeList = new ArrayList<>();
    private final String FILE_NAME = "employees.csv";
    private int lastId = 0; // Para el autoincremento profesional

    public EmployeeService() {
        loadFromCSV();
        updateLastId();
    }

    // --- PERSISTENCIA (FASE 2) ---

    private void saveToCSV() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME))) {
            writer.println("id,name,department,salary"); // Encabezado
            for (Employee emp : employeeList) {
                writer.printf("%d,%s,%s,%.2f%n", 
                    emp.getId(), emp.getName(), emp.getDepartment(), emp.getSalary());
            }
        } catch (IOException e) {
            System.err.println("Error al guardar: " + e.getMessage());
        }
    }

    private void loadFromCSV() {
        File file = new File(FILE_NAME);
        if (!file.exists()) return;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            br.readLine(); // Saltar encabezado
            String line;
            while ((line = br.readLine()) != null) {
                String[] d = line.split(",");
                employeeList.add(new Employee(
                    Integer.parseInt(d[0]), d[1], d[2], Double.parseDouble(d[3])
                ));
            }
        } catch (IOException e) {
            System.err.println("Error al cargar: " + e.getMessage());
        }
    }

    private void updateLastId() {
        for (Employee emp : employeeList) {
            if (emp.getId() > lastId) lastId = emp.getId();
        }
    }

    // --- MÉTODOS DE NEGOCIO ---

    public void addEmployee(String name, String dept, double salary) {
        Employee newEmp = new Employee(++lastId, name, dept, salary);
        employeeList.add(newEmp);
        saveToCSV(); // Persistencia inmediata
        System.out.println("Empleado guardado en archivo.");
    }

    public List<Employee> getAllEmployees() {
        return employeeList;
    }

    public void deleteEmployee(int id) {
        boolean removed = employeeList.removeIf(e -> e.getId() == id);
        if (removed) {
            saveToCSV();
            System.out.println("Registro eliminado del CSV.");
        } else {
            System.out.println("ID no encontrado.");
        }
    }
}