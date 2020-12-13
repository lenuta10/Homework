package quizz;

import java.util.Objects;

public class Circle extends Shape{

    private double radius;


    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateSurface() {
        return 3.14 * this.radius * this.radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * 3.14 * this.radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(radius);
        return (int) (temp ^ (temp >>> 32));
    }

    void add(){

    }
}
