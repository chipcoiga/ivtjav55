package com.arraydemo;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        numbers[0] = 9;
        numbers[1] = 9;
        numbers[2] = 7;
        numbers[3] = 8;
        numbers[4] = 2;
        numbers[5] = 6;
        numbers[6] = 7;
        numbers[7] = 0;
        numbers[8] = 1;
        numbers[9] = 5;

        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.println("After sort");
        Arrays.sort(numbers);
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
