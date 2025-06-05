package baitap;

import java.util.Arrays;

public class TimMaxCuaMang {
    public static void main(String[] args) {
        int[] arrays = new int[5];
        arrays[0] = 5;
        arrays[1] = 2;
        arrays[2] = 1;
        arrays[3] = 99;
        arrays[4] = 0;

        Arrays.sort(arrays);
        System.out.println(arrays[0]);
    }
}
