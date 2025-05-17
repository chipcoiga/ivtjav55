import java.util.Scanner;

public class StringNumberConverter {
    public static void main(String[] args) {
        float number = inputNumber();
        System.out.println("Số bạn đã nhập: " + number);
         float numberOfF = validateNumberF();
        System.out.println("int number cua ban: " + number);
        System.out.println("float numberOfF cua ban: " + numberOfF);
    }

    private static float inputNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ký tự bất kỳ: ");
        String numberString = scanner.nextLine();
        System.out.println("chuỗi vừa nhập: " + numberString);

        try {
            float number = Integer.parseInt(numberString);
            System.out.println("Number thu được: " + number);
            return number;
        }catch (NumberFormatException exception) {
            System.out.println("Bạn nhập vào không phải là number");
            return  inputNumber();
        }
    }
    // thay int thành float
    private static float validateNumberF() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập điểm: ");
        String input = scanner.nextLine().trim();
        input = input.replace(",", ".");

        try {
            float numberF = Float.parseFloat(input);
            System.out.println("Float thu duoc: " + numberF);
            return numberF;
        } catch (NumberFormatException exception) {
            System.out.println("Cai thu may vua nhap khong phai la Float");
            return validateNumberF();
        }
    }
}