package collectionsdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainMap {
    public static void main(String[] args) {
        Map<String, HocSinhDto> map = new HashMap<>();
        map.put("MS1", new HocSinhDto("MS1", "Loc"));
        map.put("MS2", new HocSinhDto("MS2", "Hau"));
        map.put("MS3", new HocSinhDto("MS3", "Dat"));

        HocSinhDto hocSinhDto = map.get("MS2");
        System.out.println(hocSinhDto.getName());

        HocSinhDto xxxx = new HocSinhDto("MS2", "Hau");

        List<HocSinhDto> hocSinhDtoList = new ArrayList<>();
        hocSinhDtoList.add(new HocSinhDto("MS1", "Loc"));
        hocSinhDtoList.add(xxxx);
        hocSinhDtoList.add(new HocSinhDto("MS3", "Dat"));
        hocSinhDtoList.add(new HocSinhDto("MS3", "Khang GPT"));
        hocSinhDtoList.add(new HocSinhDto("MS2", "Thuy GPT"));
        hocSinhDtoList.add(new HocSinhDto("MS2", "Thuy GPT"));

        System.out.println(hocSinhDtoList.indexOf(xxxx));

        int index = 0;
        for (HocSinhDto dto : hocSinhDtoList) {
            System.out.println("Index: " + index++);
            if (dto.getMsv().equals("MS2")) {
                System.out.println(dto.getName());
            }
        }
    }
}
