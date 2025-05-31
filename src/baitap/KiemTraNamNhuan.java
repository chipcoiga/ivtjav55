package baitap;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        int year = 2025;
        boolean result = isNamNhuan(year);
        System.out.println(result);
    }
    private static boolean isNamNhuan(int year) {
        return (year % 4 == 0) && (year % 100 != 0) && (year % 400 != 0);
    }
}

