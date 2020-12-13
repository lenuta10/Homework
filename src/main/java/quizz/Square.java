package quizz;

public class Square extends Shape{

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateSurface() {
        return this.side * this.side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * this.side;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        return Double.compare(square.side, side) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(side);
        return (int) (temp ^ (temp >>> 32));
    }
}
