package emiri;

import java.util.Scanner;

public class ScanForHocSinh {
    public static void main(String[] args) {
        HocSinh Huu = new HocSinh();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hay nhap ten: ");
        String name = scanner.nextLine();
        Huu.name = name;

        System.out.println("Hay nhap tuoi: ");
        int age = scanner.nextInt();
        Huu.age = age;

        System.out.println("Hay nhap gioi tinh");
        boolean isMale = scanner.nextBoolean();
        Huu.isMale = isMale;

        System.out.println("Nhap diem toan: ");
        int math = scanner.nextInt();
        Huu.math = math;

        System.out.println("Nhap diem hoa: ");
        int chemistry = scanner.nextInt();
        Huu.chemistry = chemistry;

        System.out.println("Nhap diem ly:");
        int physical = scanner.nextInt();
        Huu.physical = physical;

        System.out.println("Thong tin da nhap:");
        System.out.println("Name: " + Huu.name);
        System.out.println("Age: " + Huu.age);
        System.out.println("Gender: " + (Huu.isMale ? "Name" : "Nu"));
        System.out.println("Math: " + Huu.math);
        System.out.println("Physical: " + Huu.physical);
        System.out.println("Chemistry: " + Huu.chemistry);
        System.out.println("Average point: " + Huu.tinhDiemTrungBinh());
    }
}
/*
Hay nhap ten:
Emiri
Hay nhap tuoi:
30
Hay nhap gioi tinh: isMale
true
Nhap diem toan:
10
Nhap diem hoa:
10
Nhap diem ly:
9
Thong tin da nhap:
Name: Emiri
Age: 30
Gender: Name
Math: 10
Physical: 9
Chemistry: 10
Average point: 9
 */



