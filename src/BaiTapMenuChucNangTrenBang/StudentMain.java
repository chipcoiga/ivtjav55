package BaiTapMenuChucNangTrenBang;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();
        int choice;
        int numberOfStudents = 0;

        do {
            System.out.println("\n======= MENU =======");
            System.out.println("1. Nhập số lượng học sinh");
            System.out.println("2. Nhập thông tin học sinh");
            System.out.println("3. Xuất học lực");
            System.out.println("4. Thoát");
            System.out.print("Chọn: ");
            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Nhập số lượng học sinh: ");
                    numberOfStudents = sc.nextInt();
                    sc.nextLine(); // clear buffer
                    System.out.println("Đã lưu số lượng học sinh: " + numberOfStudents);
                    break;

                case 2:
                    if (numberOfStudents <= 0) {
                        System.out.println("Vui lòng nhập số lượng học sinh trước!");
                    } else {
                        manager.inputStudents(sc, numberOfStudents);
                    }
                    break;

                case 3:
                    manager.printStudentGrades();
                    break;

                case 4:
                    System.out.println("Chương trình kết thúc.");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }

        } while (choice != 4);

        sc.close();
    }
}

