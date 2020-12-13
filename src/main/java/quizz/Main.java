package quizz;

public class Main {

    public static void main(String... args) {
        Circle circle = new Circle(4);
        Rectangle rectangle = new Rectangle(4, 5);
        Square square = new Square(5);
        Triangle triangle = new Triangle(4, 5, 6);

        ShapeImpl shapes = new ShapeImpl();

        shapes.addShape(circle);
        shapes.addShape(rectangle);
        shapes.addShape(square);
        shapes.addShape(triangle);

    }

}
