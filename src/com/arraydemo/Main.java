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
