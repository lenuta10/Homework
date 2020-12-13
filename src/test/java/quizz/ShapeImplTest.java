package quizz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.*;

class ShapeImplTest {

    @Test
    public void addAllTypesOfShapes() {
        Shape circle = new Circle(4);
        Shape rectangle = new Rectangle(4, 5);
        Shape square = new Square(5);
        Shape triangle = new Triangle(4, 5, 6);

        ShapeImpl shapeimpl = new ShapeImpl();


        assertTrue(shapeimpl.addShape(circle));
        assertTrue(shapeimpl.addShape(rectangle));
        assertTrue(shapeimpl.addShape(square));
        assertTrue(shapeimpl.addShape(triangle));
    }

    @Test
    public void addDuplicates() {
        Shape circle = new Circle(4);

        ShapeImpl shapeimpl = new ShapeImpl();

        assertTrue(shapeimpl.addShape(circle));
        assertFalse(shapeimpl.addShape(circle));
    }

    @Test
    public void addSingleShape() {
        Shape circle = new Circle(4);

        ShapeImpl shapeimpl = new ShapeImpl();

        assertTrue(shapeimpl.addShape(circle));
    }

    @Test
    public void addPairsOfShapes() {
        Shape rectangle1 = new Rectangle(4, 5);
        Shape rectangle2 = new Rectangle(5, 6);

        ShapeImpl shapeimpl = new ShapeImpl();

        assertTrue(shapeimpl.addShape(rectangle1));
        assertTrue(shapeimpl.addShape(rectangle2));
    }

    @Test
    public void sumSurface() {
        Shape circle = new Circle(4);
        Shape rectangle = new Rectangle(4, 5);
        Shape square = new Square(5);
        Shape triangle = new Triangle(4, 5, 6);

        ShapeImpl shapeimpl = new ShapeImpl();

        assertTrue(shapeimpl.addShape(circle));
        assertTrue(shapeimpl.addShape(rectangle));
        assertTrue(shapeimpl.addShape(square));
        assertTrue(shapeimpl.addShape(triangle));

        double sumSurface;

        sumSurface = shapeimpl.sumSurface();

        assertEquals(105.16, sumSurface, 0.05);

    }

    @Test
    public void sumPerimeter() {
        Shape circle = new Circle(4);
        Shape rectangle = new Rectangle(4, 5);
        Shape square = new Square(5);
        Shape triangle = new Triangle(4, 5, 6);

        ShapeImpl shapeimpl = new ShapeImpl();

        assertTrue(shapeimpl.addShape(circle));
        assertTrue(shapeimpl.addShape(rectangle));
        assertTrue(shapeimpl.addShape(square));
        assertTrue(shapeimpl.addShape(triangle));

        double sumPerimeter;

        sumPerimeter = shapeimpl.sumPerimeter();

        assertEquals(78.12, sumPerimeter, 0.05);
    }
}