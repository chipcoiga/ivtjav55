package collectionsdemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainListSet {
    public static void main(String[] args) {
        String[] xxx = new String[3];
        xxx[0] = "dssf";
        xxx[1] = "safsf";
        xxx[2] = "safsf";

        List<String> strs = new ArrayList<>();
        strs.add("LHLoc");
        strs.add("LHLoc");
        strs.add("Quan");
        strs.add("Dat");
        strs.add("Son");
        System.out.println(strs.size());

        Set<Integer> number = new HashSet<>();
        number.add(5); //1
        number.add(5); //2
        number.add(5); //3
        number.add(5); //4
        number.add(6); //5
        number.add(5); //6
        number.add(5); //7
        System.out.println("Set: " + number.size()); //7?
        for (Integer x : number) {
            System.out.println(x);
        }

        List<Integer> numberX = new ArrayList<>();
        numberX.add(1); //1
        numberX.add(2); //2
        numberX.add(3); //3
        numberX.add(4); //4
        numberX.add(5); //5
        numberX.add(5); //6
        numberX.add(6); //7
        System.out.println("List: " + numberX.size()); //7
    }
}
