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

        System.out.println("Nhập No: ");
        int no = Integer.parseInt(scanner.nextLine());
        employee.setPersonNo(no);

        System.out.println("Nhập name: ");
        String name = scanner.nextLine();
        employee.setName(name);

        System.out.println("Nhập email: ");
        String email = scanner.nextLine();
        employee.setEmail(email);

        System.out.println("Nhập role: ");
        String role = scanner.nextLine();
        employee.setRole(role);

        double salary = -1;
        while (salary < 0) {
            try {
                System.out.println("Nhập lương: ");
                salary = Double.parseDouble(scanner.nextLine());
                if (salary < 0) {
                    System.out.println("Lương phải là số dương.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Lương phải là số dương.");
            }
        }
        employee.setSalary(salary);

        repository.add(employee);
    }

    public void printEmployees() {
        List<Person> people = repository.getPeople();

        for (Person person : people) {
            if (person instanceof Employee employee) {
                System.out.println("No: " + employee.getPersonNo());
                System.out.println("Name: " + employee.getName());
                System.out.println("Email: " + employee.getEmail());
                System.out.println("Role: " + employee.getRole());
                System.out.println("Salary: " + String.format("%.1f", employee.getSalary()));
            } else if (person instanceof Partner partner) {
                System.out.println("No: " + partner.getPersonNo());
                System.out.println("Name: " + partner.getName());
                System.out.println("Email: " + partner.getEmail());
                System.out.println("Role: Partner");
                System.out.println("Base Salary: " + String.format("%.1f", partner.getSalary()));
                System.out.println("KPI: " + partner.getKpi());
                System.out.println("Actual Salary: " + String.format("%.1f", partner.getActualSalary()));
            }

            System.out.println("==============");
        }
    }

    public void calculateTotalSalaryOfMonth() {
        List<Person> people = repository.getPeople();

        double totalSalary = 0;
        for (Person person : people) {
            if (person instanceof Employee employee) {
                totalSalary += employee.getSalary();
            } else if (person instanceof Partner partner) {
                totalSalary += partner.getActualSalary();
            }
        }

        System.out.println("Total salary: " + String.format("%.1f", totalSalary));
    }


    public void createPartner() {
        Partner partner = new Partner();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập No: ");
        partner.setPersonNo(Integer.parseInt(scanner.nextLine()));

        System.out.println("Nhập Name: ");
        partner.setName(scanner.nextLine());

        System.out.println("Nhập Email: ");
        partner.setEmail(scanner.nextLine());

        double salary = -1;
        while (salary < 0) {
            try {
                System.out.println("Nhập lương cơ bản: ");
                salary = Double.parseDouble(scanner.nextLine());
                if (salary < 0) System.out.println("Lương phải là số dương.");
            } catch (Exception e) {
                System.out.println("Lương phải là số dương.");
            }
        }
        partner.setSalary(salary);

        int kpi = -1;
        while (kpi < 0) {
            try {
                System.out.println("Nhập KPI (%): ");
                kpi = Integer.parseInt(scanner.nextLine());
                if (kpi < 0) System.out.println("KPI phải là số >= 0.");
            } catch (Exception e) {
                System.out.println("KPI phải là số nguyên.");
            }
        }
        partner.setKpi(kpi);

        repository.add(partner);
    }
}
