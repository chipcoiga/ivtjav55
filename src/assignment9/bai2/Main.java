package assignment9.bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeRepository repository = new EmployeeRepository();
        EmployeeService service = new EmployeeService(repository);

        int menuOptionSelected;
        do {
            menuOptionSelected = inputOptionSelected();
            switch (menuOptionSelected) {
                case 1 -> service.createEmployee();
                case 2 -> service.printEmployees();
                case 3 -> service.calculateTotalSalaryOfMonth();
                case 4 -> service.createPartner();
            }
        } while (menuOptionSelected != 0);
    }

    private static int inputOptionSelected() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("========== MENU ==========");
            System.out.println("1: Nhập thông tin nhân viên");
            System.out.println("2: In toàn bộ thông tin nhân viên và partner");
            System.out.println("3: Tính tổng lương nhân viên và partner");
            System.out.println("4: Nhập thông tin partner");
            System.out.println("0: Thoát");
            System.out.print("Chọn chức năng: ");
            int selectedNumber = scanner.nextInt();
            return selectedNumber;
        } catch (Exception e) {
            System.out.println("Vui lòng nhập số.");
            return inputOptionSelected();
        }
    }
}
