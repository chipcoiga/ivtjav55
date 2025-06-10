package listHocSinh;

import java.util.*;

public class MainListHS {

    // Hàm thêm học sinh vào map
    public static void themHocSinh(Map<String, List<HocSinh>> map, HocSinh hs) {
        map.putIfAbsent(hs.getMlh(), new ArrayList<>());
        map.get(hs.getMlh()).add(hs);
    }

    public static void main(String[] args) {
        Map<String, List<HocSinh>> map = new HashMap<>();

        themHocSinh(map, new HocSinh("MS1", "Thành Đạt 1", "PRR55"));
        themHocSinh(map, new HocSinh("MS2", "Thành Đạt 2", "PRR55"));
        themHocSinh(map, new HocSinh("MS3", "Thành Đạt 3", "PRR55"));
        themHocSinh(map, new HocSinh("MS4", "Thành Đạt 4", "PRR56"));
        themHocSinh(map, new HocSinh("MS5", "Thành Đạt 5", "PRR57"));
        themHocSinh(map, new HocSinh("MS6", "Thành Đạt 6", "PRR56"));
        themHocSinh(map, new HocSinh("MS7", "Thành Đạt 7", "PRR57"));
        themHocSinh(map, new HocSinh("MS8", "Thành Đạt 8", "PRR58"));
        themHocSinh(map, new HocSinh("MS9", "Thành Đạt 9", "PRR58"));
        themHocSinh(map, new HocSinh("MS10", "Thành Đạt 10", "PRR58"));

        System.out.println("Có " + map.size() + " lớp\n");

        for (String lop : map.keySet()) {
            List<HocSinh> dsHocSinh = map.get(lop);

            System.out.println("Lớp " + lop + " có " + dsHocSinh.size() + " học sinh.");
            System.out.print("Danh sách học sinh: ");

            for (HocSinh hs : dsHocSinh) {
                System.out.print(hs.getName() + " ");
            }
            System.out.println("\n");
            //d
        }
    }
}
