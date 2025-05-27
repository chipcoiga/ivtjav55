package com.string;

public class ArrayString {
    public static void main(String[] args) {
        //type [] arrayName;
        //Khai bao mang co 10 phan tu
        int[] numbers =  new int[5];
        numbers[0] = 5;
        numbers[1] = 6;
        numbers[2] = 2;
        numbers[3] = 1;
        numbers[4] = 0;

        boolean[] bool = new boolean[10];
        bool[0] = true;
        bool[1] = false;
        bool[3] = true;

        for (int i = 0; i < numbers.length; i++) {
            int numberI = numbers[i];
            int value = numberI * 2;

            System.out.println(value);
        }




//        String fullName = "NguyenWVanWA";
        String fullName = "Nguyen Van A";
        String[] x = fullName.split(" ");
        /**
         * x[0] = "Nguyen"
         * x[1] = "Van"
         * x[2] = "A"
         */
        for (int i = 0; i < x.length; i++) {
            String temp = x[i];
            System.out.println(temp);
        }
    }
}
