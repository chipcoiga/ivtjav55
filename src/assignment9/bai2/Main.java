package assignment9.bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PersonRepository repository = new PersonRepository();
        EmployeeService service = new EmployeeService(repository);
        PartnerService partnerService = new PartnerService(repository);


        int menuOptionSelected;
        do {
            menuOptionSelected = inputOptionSelected();
            switch (menuOptionSelected) {
                case 1 -> service.createEmployee();
                case 2 -> partnerService.createPartner();
                case 3 -> service.printEmployees();
                case 4 -> service.calculateTotalSalaryOfMonth();
            }
        } while (menuOptionSelected != 0);
    }

    private static int inputOptionSelected() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhap lua cho chuc nang:");
            System.out.println("1: Nhap thong tin nhan vien");
            System.out.println("2: Nhap thong tin partner");
            System.out.println("3: In toan bo thong tin nhan vien");
            System.out.println("4: Tinh tong luong nhan vien");
            int selectedNumber = scanner.nextInt();
            return selectedNumber;
        } catch (Exception e) {
            System.out.println("Vui long nhap so");
            return inputOptionSelected();
        }
    }
}
