package emiri;

import java.util.Scanner;

public class condittion {
    public static void main(String[] args) {
        HocSinh emiri = new HocSinh();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập điểm Toán: ");
        emiri.setMath(scanner.nextInt());

        System.out.print("Nhập điểm Hóa: ");
        emiri.setChemistry(scanner.nextInt());

        System.out.print("Nhập điểm Lý: ");
        emiri.setPhysical(scanner.nextInt());

        float point = (emiri.getMath() + emiri.getChemistry() + emiri.getPhysical()) / 3.0f;
        System.out.printf("Điểm trung bình: %.2f\n", point);

        academicPerformance(point);
    }

    private static void academicPerformance(float point) {
        if (point < 5) {
            System.out.println("Học lực kém");
        } else if (point <= 8) {
            System.out.println("Học lực khá");
        } else {
            System.out.println("Học lực giỏi");
        }
    }
}
