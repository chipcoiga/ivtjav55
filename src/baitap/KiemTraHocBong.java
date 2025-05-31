package baitap;

public class KiemTraHocBong {

    public static void main(String[] args) {
        float math = 5, chemistry = 6, physical = 7, english = 8;
        int soBuoiVang = 3;
        boolean result = hasHocBong(math, physical, chemistry, english, soBuoiVang);
        if (result) {
            System.out.println("Đạt Học Bổng");
        } else {
            System.out.println("Không Đạt Học Bổng");
        }
    }

    private static boolean hasHocBong(
            float math,
            float physical,
            float chemistry,
            float english,
            int soBuoiVang) {

        if (math <= 6.5f || physical <= 6.5f || chemistry <= 6.5f || english <= 6.5f) {
            System.out.println("Có môn học dưới 6.5");
            return false;
        }

        if (soBuoiVang > 3) {
            System.out.println("Sóo buổi vắng quá nhiều");
            return false;
        }

        float diemTrungBinh = averagePoint(math, physical, chemistry, english);
        if (diemTrungBinh < 8.0f) {
            System.out.println("Điểm trung bình chưa đạt 8.0");
            return false;
        }

        return true;
    }

    private static float averagePoint(float math, float physical, float chemistry, float english) {
        return (math + physical + chemistry + english) / 4.0f;
    }
}
