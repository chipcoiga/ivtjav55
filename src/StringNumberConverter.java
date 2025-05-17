import java.util.Scanner;

public class StringNumberConverter {
    public static void main(String[] args) {
        float number = inputNumber();
        System.out.println("Số bạn đã nhập: " + number);
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
    //NOP BAI TAP QUA GIT
}