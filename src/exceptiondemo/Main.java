package exceptiondemo;

public class Main {
    public static void main(String[] args) {

        try {
            int b = 5;
            int c = 0;
            int a = div(b, c);
        } catch (DivZeroException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Luôn được chạy");
        }

        System.out.println("Finished");
    }

    private static int div (int a, int b) throws DivZeroException {
        if (b == 0) {
            throw new DivZeroException("Loi chia cho 0");
        }
        return a/b;
    }
}
