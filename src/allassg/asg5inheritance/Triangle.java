package allassg.asg5inheritance;

public class Triangle extends Polygon{
    public Triangle() {
        super(3); // A triangle always has 3 sides
    }

    public boolean isValidTriangle() {
        int[] sides = getSideLengths();
        int a = sides[0];
        int b = sides[1];
        int c = sides[2];
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    @Override
    public int calculatePerimeter() {
        return super.calculatePerimeter();
    }

    public double calculateArea() {
        int[] sides = getSideLengths();
        int a = sides[0];
        int b = sides[1];
        int c = sides[2];
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
