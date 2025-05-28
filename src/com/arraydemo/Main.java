package com.arraydemo;

import com.demo.javcore.domain.HocSinhDto;
import com.demo.javcore.service.HocSinhService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice  ;
        int numberOfStudent = 0;
        HocSinhDto[] students = null;

        do {
            System.out.println("1.Nhập số lượng student: ");
            System.out.println("2.Nhập thông tin student: ");
            System.out.println("3.Xuất học lực");
            System.out.println("4.Thoát chương trình");
            System.out.println();

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    numberOfStudent = inputNumberOfStudent();
                    break;
                case 2:
                    if (numberOfStudent <= 0) {
                        System.out.println("Vui lòng nhập số lượng học sinh trước.");
                    } else {
                        students = inputStudentInformation(numberOfStudent);
                    }
                    break;
                case 3:
                    if (students == null) {
                        System.out.println("Vui lòng nhập thông tin học sinh trước.");
                    } else {
                        for (int i = 0; i < students.length; i++) {
                            phanLoaiHocLuc(students[i]);
                        }

                    }
                    break;
                case 4:
                    System.out.println("Đã thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại (1-4).");


            }
        }while (choice != 4);
    }

    private static HocSinhDto[] inputStudentInformation(int numberOfStudent) {
        HocSinhDto[] students = new HocSinhDto[numberOfStudent];
        for (int i = 0; i < numberOfStudent; i++) {
            students[i] = inputStudent(i);
        }
        return students;
    }

    private static HocSinhDto inputStudent(int index) {
        Scanner scanner = new Scanner(System.in);
        HocSinhDto student = new HocSinhDto();
        System.out.println("Hay nhap thong tin cho student: " + index);
        System.out.println("Nhap name: ");
        String name = scanner.nextLine();
        student.setName(name);

        System.out.println("Nhap diem toan:");
        int math = scanner.nextInt();
        student.setMath(math);

        System.out.println("Nhap diem Ly:");
        int physical = scanner.nextInt();
        student.setPhysical(physical);

        System.out.println("Nhap diem Hoa:");
        int chemistry = scanner.nextInt();
        student.setChemistry(chemistry);


        return student;
    }

    private static int inputNumberOfStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hay nhap so luong student: ");
        int number = scanner.nextInt();
        System.out.println("May da nhap " + number + " students.");
        return number;
    }

    private static void phanLoaiHocLuc(HocSinhDto student) {
        HocSinhService service = new HocSinhService();
        String hocLuc = service.phanLoaiHocLuc(student);
        System.out.println(student.getName() + ": " + hocLuc);
    }
}
