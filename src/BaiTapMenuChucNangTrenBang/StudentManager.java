package BaiTapMenuChucNangTrenBang;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();

    public void inputStudents(Scanner sc, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("Nhập thông tin học sinh thứ " + (i + 1) + ":");
            System.out.print("Tên: ");
            String name = sc.nextLine();
            System.out.print("Toán: ");
            double math = sc.nextDouble();
            System.out.print("Lý: ");
            double physics = sc.nextDouble();
            System.out.print("Hóa: ");
            double chemistry = sc.nextDouble();
            sc.nextLine(); // Xóa dòng thừa
            students.add(new Student(name, math, physics, chemistry));
        }
    }

    public void printStudentGrades() {
        if (students.isEmpty()) {
            System.out.println("Danh sách học sinh trống!");
            return;
        }
        System.out.println("\n=== DANH SÁCH HỌC LỰC ===");
        for (Student s : students) {
            System.out.printf("Tên: %s - ĐTB: %.2f - Học lực: %s%n",
                    s.getName(), s.getAverage(), s.getGrade());
        }
    }

    public boolean isEmpty() {
        return students.isEmpty();
    }
}

