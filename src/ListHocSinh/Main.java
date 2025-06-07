package ListHocSinh;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<HocSinh> list = new ArrayList<>();
        list.add(new HocSinh("001", "An", "L01"));
        list.add(new HocSinh("002", "Binh", "L02"));
        list.add(new HocSinh("003", "Chi", "L01"));
        list.add(new HocSinh("004", "Dung", "L03"));
        list.add(new HocSinh("005", "Em", "L02"));

        Map<String, Integer> lopMap = new HashMap<>();

        for (HocSinh hs : list) {
            String mlh = hs.getMLH();
            lopMap.put(mlh, lopMap.getOrDefault(mlh, 0) + 1);
        }

        System.out.println("Số lớp: " + lopMap.size());

        for (Map.Entry<String, Integer> entry : lopMap.entrySet()) {
            System.out.println("Lớp " + entry.getKey() + " có " + entry.getValue() + " học sinh.");
        }
    }
}