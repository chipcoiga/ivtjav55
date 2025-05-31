import java.util.Scanner;

public class MenuCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Hiển thị menu
            System.out.println("=== MÁY TÍNH ĐƠN GIẢN ===");
            System.out.println("1. Cộng");
            System.out.println("2. Trừ");
            System.out.println("3. Nhân");
            System.out.println("4. Chia");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng (1-5): ");
            choice = scanner.nextInt();

            if (choice >= 1 && choice <= 4) {
                // Nhập hai số nếu không chọn thoát
                System.out.print("Nhập số thứ nhất: ");
                double a = scanner.nextDouble();
                System.out.print("Nhập số thứ hai: ");
                double b = scanner.nextDouble();

                switch (choice) {
                    case 1:
                        System.out.println("Kết quả: " + (a + b));
                        break;
                    case 2:
                        System.out.println("Kết quả: " + (a - b));
                        break;
                    case 3:
                        System.out.println("Kết quả: " + (a * b));
                        break;
                    case 4:
                        if (b != 0) {
                            System.out.println("Kết quả: " + (a / b));
                        } else {
                            System.out.println("Lỗi: Không thể chia cho 0.");
                        }
                        break;
                }
            } else if (choice == 5) {
                System.out.println("Thoát chương trình.");
            } else {
                System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn từ 1 đến 5.");
            }

            System.out.println(); // dòng trống cho dễ đọc

        } while (choice != 5);

        scanner.close();
    }
}
