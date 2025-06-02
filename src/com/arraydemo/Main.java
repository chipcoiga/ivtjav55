package com.arraydemo;

import com.demo.javcore.domain.HocSinhDto;
import com.demo.javcore.service.HocSinhService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numberOfStudent = inputNumberOfStudent();
        HocSinhDto[] students = inputStudentInformation(numberOfStudent);
        for (int i = 0 ; i < students.length; i++) {
            phanLoaiHocLuc(students[i]);
        }
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.println("Menu: ");
            System.out.println("1. Nhap so luong hoc sinh");
            System.out.println("2. Nhap thong tin hoc sing");
            System.out.println("3 .Xuat hoc luc");
            System.out.println("4 .Thoat");
            System.out.println("Choose number: ");
            number = scanner.nextInt();
            switch (number) {
                case 1:
                    inputNumberOfStudent();
                    break;
                case 2:
                    inputStudentInformation(numberOfStudent);
                    break;
                case 3:
                    for (int i = 0 ; i < students.length; i++) {
                        phanLoaiHocLuc(students[i]);
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println(" So khong dung");
                    continue;

            }

        }
        while(number!=0);
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
