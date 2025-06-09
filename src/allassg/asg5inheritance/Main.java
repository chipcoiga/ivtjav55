package allassg.asg5inheritance;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triangle triangle = new Triangle();

        int[] sides = new int[3];
        System.out.println("Nhap do dai 3 canh tam giac:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Side " + (i + 1) + ": ");
            sides[i] = scanner.nextInt();
        }

        triangle.setSideLengths(sides);

        if (!triangle.isValidTriangle()) {
            System.out.println("Canh ban nhap khong tao thanh 1 tam giac hop le.");
        } else {
            triangle.printSides();
            System.out.println("Chu vi: " + triangle.calculatePerimeter());
            System.out.printf("Dien tich: %.2f\n", triangle.calculateArea());
        }

    }
}
