package emiri;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int [] numbers = {10, 8, 7, 5, 6, 7};
        Arrays.sort(numbers);
        for(int number: numbers){
            System.out.println(number);
        }

    }
}
