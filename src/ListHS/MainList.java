package ListHS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainList {
    public static void main(String[] args) {
        List<HocSinh> ds = new ArrayList<>();

        ds.add(new HocSinh("1" ,"khánh" , "19","a1"));
        ds.add(new HocSinh("2" ,"nguyen" , "17","a1"));
        ds.add(new HocSinh("3" ,"JBL" , "15","a3"));
        ds.add(new HocSinh("2" ,"SQL" , "19","a4"));

        Map<String, Integer> TKLH = new HashMap<>();

        for (HocSinh hs : ds) {
            String lop = hs.getMLH();
            if(TKLH.containsKey(lop)) {
                TKLH.put(lop, TKLH.get(lop)+1);
            } else {
                TKLH.put(lop,1);
            }
        }

        System.out.println(" Số lớp:" + TKLH.size());
        System.out.println(" Số HS của mỗi lớp " );
        for(Map.Entry<String, Integer>entry : TKLH.entrySet()) {
            System.out.println("Lớp"+ entry.getKey()+ ": " + entry.getValue() +" HS"   );
        }

    }
}
