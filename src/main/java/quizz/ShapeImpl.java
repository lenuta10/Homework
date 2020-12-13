package quizz;

import java.util.ArrayList;
import java.util.List;

public class ShapeImpl implements IShape {

    List<Shape> shapeList;

    public ShapeImpl() {
        this.shapeList = new ArrayList<>();
    }

    @Override
    public boolean addShape(Shape shape) {

        boolean isGood = true;

        for(Shape shape2: shapeList)
        {
            if((shape2.equals(shape)))
            {
                isGood = false;
                System.out.println("There is already a similar shape in the list");
                break;
            }
        }
        if(isGood){
            this.shapeList.add(shape);
        }
        return isGood;
    }



    @Override
    public double sumPerimeter() {
        double sum = 0.0;

        for (Shape shape : shapeList) {
            sum = sum + shape.calculatePerimeter();
        }

        return sum;
    }

    @Override
    public double sumSurface() {
        double sum = 0.0;

        for (Shape shape : shapeList) {
            sum = sum + shape.calculateSurface();
        }

        return sum;
    }
}
