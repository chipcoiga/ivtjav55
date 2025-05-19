package emiri;

import java.util.Scanner;

public class ScanForHocSinh {
    public static void main(String[] args) {
        HocSinh emiri = new HocSinh();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hay nhap ten: ");
        String name = scanner.nextLine();
        emiri.name = name;

        System.out.println("Hay nhap tuoi: ");
        int age = scanner.nextInt();
        emiri.age = age;

        System.out.println("Hay nhap gioi tinh");
        boolean isMale = scanner.nextBoolean();
        emiri.isMale = isMale;

        System.out.println("Nhap diem toan: ");
        int math;
        do {
            System.out.println("Nhap diem toan (phai >= 8): ");
            math = scanner.nextInt();
            if (math < 8) {
                System.out.println("Diem toan phai >= 8, vui long nhap lai!");
            }
        } while (math < 8);
        emiri.math = math;

        System.out.println("Nhap diem hoa: ");
        int chemistry = scanner.nextInt();
        emiri.chemistry = chemistry;

        System.out.println("Nhap diem ly:");
        int physical = scanner.nextInt();
        emiri.physical = physical;

        System.out.println("Thong tin da nhap:");
        System.out.println("Name: " + emiri.name);
        System.out.println("Age: " + emiri.age);
        System.out.println("Gender: " + (emiri.isMale ? "Name" : "Nu"));
        System.out.println("Math: " + emiri.math);
        System.out.println("Physical: " + emiri.physical);
        System.out.println("Chemistry: " + emiri.chemistry);
        System.out.println("Average point: " + emiri.tinhDiemTrungBinh());
        System.out.println("Xep loai hoc luc: " + emiri.xepLoaiHocLuc());
    }
}
