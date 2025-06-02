package allassg.asg5inheritance;

public class Polygon {
    private  int numberside;
    private int[] sideLengths;

    public Polygon(int numberOfSides) {
        this.numberside = numberOfSides;
        sideLengths = new int[numberOfSides];
    }

    public void setSideLengths(int[] lengths) {
        if (lengths.length == numberside) {
            for (int i = 0; i < numberside; i++) {
                sideLengths[i] = lengths[i];
            }
        } else {
            System.out.println("số lượng canh không thân thiết.");
        }
    }

    public int[] getSideLengths() {
        return sideLengths;
    }

    public int calculatePerimeter() {
        int perimeter = 0;
        for (int i = 0; i < numberside; i++) {
            perimeter += sideLengths[i];
        }
        return perimeter;
    }
    public void printSides() {
        System.out.print("So canh: ");
        for (int length : sideLengths) {
            System.out.print(length + " ");
        }
        System.out.println();
    }

    public int getNumberOfSides() {
        return numberside;
    }
}
