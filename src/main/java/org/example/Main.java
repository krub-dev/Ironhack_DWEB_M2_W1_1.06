package org.example;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Employee[] employeesArray = createEmployees();
        //List<Employee> employees = new ArrayList<>(); // Se puede hacer así, más dinámico

        writeEmployeesTXT(employeesArray);
    }

    private static Employee[] createEmployees() {
        final int NUM_EMP = 10;
        Employee[] employeesArray = new Employee[NUM_EMP];

        // 8 employees
        employeesArray[0] = new Employee("María García", "maria.garcia@empresa.com", 32, 42000);
        employeesArray[1] = new Employee("Carlos Martínez", "carlos.martinez@empresa.com", 28, 38000);
        employeesArray[2] = new Employee("Laura Rodríguez", "laura.rodriguez@empresa.com", 35, 45000);
        employeesArray[3] = new Employee("Javier Fernández", "javier.fernandez@empresa.com", 41, 52000);
        employeesArray[4] = new Employee("Ana López", "ana.lopez@empresa.com", 27, 36000);
        employeesArray[5] = new Employee("David Sánchez", "david.sanchez@empresa.com", 38, 48000);
        employeesArray[6] = new Employee("Sofía Pérez", "sofia.perez@empresa.com", 31, 41000);
        employeesArray[7] = new Employee("Daniel Gómez", "daniel.gomez@empresa.com", 45, 55000);

        // 2 Interns
        employeesArray[8] = new Intern("Elena Martín", "elena.martin@empresa.com", 29, 19000);
        employeesArray[9] = new Intern("Pablo Jiménez", "pablo.jimenez@empresa.com", 22, 18000);

        return employeesArray;
    }

    private static void writeEmployeesTXT(Employee[] employees) {

        try {
            FileWriter writer = new FileWriter("employees.txt");
            for (int i = 0; i < employees.length; i++) {
                writer.write(employees[i].toString() + "\n");
            }
            System.out.println("Employee data successfully saved to employees.txt");
            writer.close();
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
