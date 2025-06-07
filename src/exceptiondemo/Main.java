package exceptiondemo;

import java.io.IOException;
import java.util.EmptyStackException;

public class Main {
    public static void main(String[] args) {

        try {
            int b = 5;
            int c = 0;
            int a = div(b, c);
        } catch (QuocThongException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Luôn được chạy");
        }

        System.out.println("Finished");
    }

    private static int div (int a, int b) throws QuocThongException {
        if (b == 0) {
            throw new QuocThongException("Loi chia cho 0");
        }
        return a/b;
    }
}
