package quizz;

import static java.lang.StrictMath.sqrt;

public class Triangle extends Shape{

    private double sideOne;
    private double sideTwo;
    private double sideThree;

    public Triangle(double sideOne, double sideTwo, double sideThree) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }

    @Override
    public double calculatePerimeter() {
        return this.sideOne + this.sideTwo + this.sideThree;
    }

    @Override
    public double calculateSurface() {
        double halfPerimeter = calculatePerimeter() / 2;

        return sqrt(halfPerimeter * (halfPerimeter - sideOne) * (halfPerimeter - sideTwo) * (halfPerimeter - sideThree) );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.sideOne, sideOne) != 0) return false;
        if (Double.compare(triangle.sideTwo, sideTwo) != 0) return false;
        return Double.compare(triangle.sideThree, sideThree) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(sideOne);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideTwo);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideThree);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
