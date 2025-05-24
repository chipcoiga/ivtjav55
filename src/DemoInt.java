public class DemoInt {
    public static void main(String[] args) {
        try {
            int b = Integer.parseInt("5");
            System.out.println(b);
            float a = 5/0;
        } catch (NumberFormatException e) {
            System.out.println("TOANG ROI, Khong phai so");
        } catch (ArithmeticException e) {
            System.out.println("Loi chia cho 0");
        }
    }


}
