package emiri;

import java.util.Scanner;

public class ScanForHocSinh {
    public static void main(String[] args) {
        HocSinh emiri = new HocSinh();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hay nhap ten: ");
        String name = scanner.nextLine();
        emiri.setName(name);

        System.out.println("Hay nhap tuoi: ");
        int age = scanner.nextInt();
        emiri.setAge(age);

        System.out.println("Hay nhap gioi tinh");
        boolean isMale = scanner.nextBoolean();
        emiri.setMale(isMale);

        int math;
        do {
            System.out.println("Nhập điểm toán (>= 8): ");
            math = scanner.nextInt();
            if (math < 8) {
                System.out.println("Điểm toán phải >= 8. Vui lòng nhập lại.");
            }
        } while (math < 8);
        emiri.setMath(math);

        System.out.println("Nhap diem hoa: ");
        int chemistry = scanner.nextInt();
        emiri.setChemistry(chemistry);

        System.out.println("Nhap diem ly:");
        int physical = scanner.nextInt();
        emiri.setPhysical(physical);

        System.out.println("Thong tin da nhap:");
        System.out.println("Name: " + emiri.getName());
        System.out.println("Age: " + emiri.getAge());
        System.out.println("Gender: " + (emiri.isMale() ? "Name" : "Nu"));
        System.out.println("Math: " + emiri.getMath());
        System.out.println("Physical: " + emiri.getPhysical());
        System.out.println("Chemistry: " + emiri.getChemistry());
        System.out.println("Average point: " + emiri.tinhDiemTrungBinh());
        double avg = emiri.tinhDiemTrungBinh();
        System.out.println("Điểm trung bình: " + avg);

        // Xếp loại học lực
        if (avg < 5) {
            System.out.println("Xếp loại: Học kém");
        } else if (avg < 8) {
            System.out.println("Xếp loại: Học khá");
        } else {
            System.out.println("Xếp loại: Học giỏi");
        }
    }

    public static void demoConstructor() {
        Scanner scanner = new Scanner(System.in);

        String name = "Fudaka";//Scan
        int age = 30;
        boolean isMale = false;
        int math = 10;

        System.out.println("Nhap diem ly:");
        int physical = scanner.nextInt();
//        int physical = 10;
        int chemistry = 10;

        HocSinh KieuTrinh = new HocSinh();
        HocSinh fudaka = new HocSinh(
                name,
                age,
                isMale,
                math,
                physical,
                chemistry
        );
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