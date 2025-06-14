package assignment9.bai2;

import java.util.List;
import java.util.Scanner;

public class EmployeeService {
    private EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public void createEmployee() {
        Employee employee = new Employee();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap No: ");
        int no = scanner.nextInt();
        scanner.nextLine();
        employee.setPersonNo(no);

        System.out.println("Nhap name: ");
        String name = scanner.nextLine();
        employee.setName(name);

        System.out.println("Nhap role: ");
        String role = scanner.nextLine();
        employee.setRole(role);

        System.out.println("Nhap luong: ");
        double salary = scanner.nextDouble();
        employee.setSalary(salary);

        repository.add(employee);
    }

    public void printEmployees() {
        List<Employee> employees = repository.getEmployees();
        for (Employee employee : employees) {
            System.out.println("No: " + employee.getPersonNo());
            System.out.println("Name: " + employee.getName());
            System.out.println("Role: " + employee.getRole());
            System.out.println("Salary: " + String.format("%.1f", employee.getSalary()));
            System.out.println("==============");

        }
    }

    public void calculateTotalSalaryOfMonth() {
        List<Employee> employees = repository.getEmployees();

        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary = totalSalary + employee.getSalary();
        }

        System.out.println("Total salary: " + String.format("%.1f", totalSalary));
    }
}
