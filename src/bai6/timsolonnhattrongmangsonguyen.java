package bai6;

public class timsolonnhattrongmangsonguyen {

    // Phương pháp 1: Sử dụng vòng lặp for thông thường
    public static int findMaxWithLoop(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Mảng không được rỗng hoặc null");
        }

        int max = arr[0]; // Giả sử phần tử đầu tiên là lớn nhất

        // Duyệt qua các phần tử còn lại
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    // Phương pháp 2: Sử dụng enhanced for loop
    public static int findMaxWithEnhancedLoop(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Mảng không được rỗng hoặc null");
        }

        int max = arr[0];

        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }

    // Phương pháp 3: Sử dụng Collections.max() (với Arrays.asList())
    public static int findMaxWithCollections(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Mảng không được rỗng hoặc null");
        }

        return java.util.Collections.max(java.util.Arrays.asList(
                java.util.Arrays.stream(arr).boxed().toArray(Integer[]::new)
        ));
    }

    // Phương pháp 4: Sử dụng Stream API (Java 8+)
    public static int findMaxWithStream(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Mảng không được rỗng hoặc null");
        }

        return java.util.Arrays.stream(arr).max().orElseThrow();
    }

    // Phương pháp 5: Đệ quy
    public static int findMaxWithRecursion(int[] arr, int n) {
        // Trường hợp cơ sở: chỉ có 1 phần tử
        if (n == 1) {
            return arr[0];
        }

        // Tìm max của n-1 phần tử đầu
        int maxOfRest = findMaxWithRecursion(arr, n - 1);

        // So sánh với phần tử cuối cùng
        return Math.max(arr[n - 1], maxOfRest);
    }

    // Phương pháp 6: Sử dụng Math.max() với vòng lặp
    public static int findMaxWithMath(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Mảng không được rỗng hoặc null");
        }

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }

        return max;
    }

    public static void main(String[] args) {
        // Tạo mảng test
        int[] numbers = {45, 23, 78, 12, 89, 34, 67, 91, 56, 28};

        System.out.println("Mảng: " + java.util.Arrays.toString(numbers));
        System.out.println();

        // Test các phương pháp khác nhau
        System.out.println("Phương pháp 1 - Vòng lặp for: " +
                findMaxWithLoop(numbers));

        System.out.println("Phương pháp 2 - Enhanced for: " +
                findMaxWithEnhancedLoop(numbers));

        System.out.println("Phương pháp 3 - Collections.max(): " +
                findMaxWithCollections(numbers));

        System.out.println("Phương pháp 4 - Stream API: " +
                findMaxWithStream(numbers));

        System.out.println("Phương pháp 5 - Đệ quy: " +
                findMaxWithRecursion(numbers, numbers.length));

        System.out.println("Phương pháp 6 - Math.max(): " +
                findMaxWithMath(numbers));

        System.out.println();

        // Test với mảng có số âm
        int[] negativeNumbers = {-45, -23, -78, -12, -89};
        System.out.println("Mảng có số âm: " + java.util.Arrays.toString(negativeNumbers));
        System.out.println("Số lớn nhất: " + findMaxWithLoop(negativeNumbers));

        // Test hiệu suất (chỉ để minh họa)
        int[] largeArray = new int[1000000];
        for (int i = 0; i < largeArray.length; i++) {
            largeArray[i] = (int) (Math.random() * 1000);
        }

        long startTime, endTime;

        // Test hiệu suất vòng lặp for
        startTime = System.nanoTime();
        int maxLoop = findMaxWithLoop(largeArray);
        endTime = System.nanoTime();
        System.out.println("\nHiệu suất vòng lặp for: " + (endTime - startTime) + " ns");

        // Test hiệu suất Stream API
        startTime = System.nanoTime();
        int maxStream = findMaxWithStream(largeArray);
        endTime = System.nanoTime();
        System.out.println("Hiệu suất Stream API: " + (endTime - startTime) + " ns");

        System.out.println("\nKết quả giống nhau: " + (maxLoop == maxStream));
    }
}