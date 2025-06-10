package assignment9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentRepository repository = new StudentRepository();
        StudentService service = new StudentService(repository);

        int selectedOption;

        do {
            selectedOption = getSelectedOption();
            switch (selectedOption) {
                case 1 -> service.createStudent();
                case 2 -> service.printAllStudents();
                case 3 -> service.printAllStudentAverageMark();
                case 4 -> service.printSortedStudents();
            }
        } while (selectedOption != 0);
    }

    private static int getSelectedOption() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hay lua chon chuc nang: ");
        System.out.println("1. Nhap student");
        System.out.println("2. In toan bo student");
        System.out.println("3. Tinh va in diem trung binh");
        System.out.println("4. Sap xep theo diem trung binh");
        System.out.println("0. Ket thuc chuong trinh");

        int selectedOption = scanner.nextInt();
        return selectedOption;
    }
}
