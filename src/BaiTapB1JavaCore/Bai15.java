package BaiTapB1JavaCore;

import java.util.Scanner;

public class Bai15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhập số bị chia (tử số): ");
            int numerator = scanner.nextInt();

            System.out.print("Nhập số chia (mẫu số): ");
            int denominator = scanner.nextInt();

            int result = numerator / denominator;
            System.out.println("Kết quả: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Lỗi: Không thể chia cho 0.");
        } catch (Exception e) {
            System.out.println("Lỗi không xác định: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Chương trình kết thúc.");
        }
    }
}

