import javafx.scene.shape.Circle;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ShapeList {
    ArrayList<Shape> shapes;
    private int minValue = 1;
    private int maxValue = 100;

    public ArrayList<Shape> getShapes() {
        return shapes;
    }

    public ShapeList() {
        shapes = generateShapeList();
    }

    public ArrayList<Shape> generateShapeList(){
        ArrayList<Shape> shapes = new ArrayList<>();
        int size = (int) (Math.random() * (maxValue - minValue + 1) + minValue);
        for (int i = 0; i < size; i++) {
            int randomShapeNumber = (int) (Math.random() * (4 - 1 + 1) +1);
            if (randomShapeNumber==1){
                shapes.add(new Square());
            } else if (randomShapeNumber==2){
                shapes.add(new Trapeze());
            } else if (randomShapeNumber==3){
                shapes.add(new Triangle());
            } else if (randomShapeNumber==4){
                shapes.add(new Сircle());
            }
                    }
        return shapes;
    }

    public void printShapeList(ArrayList<Shape> shapes){
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i).getClass().equals(Square.class)){
                System.out.println("Square"+ ", sideLength="+((Square) shapes.get(i)).getSideLength() + ", square=" + shapes.get(i).getSquare()+ ", color is " + shapes.get(i).getColor());
            } else if (shapes.get(i).getClass().equals(Trapeze.class)){
                System.out.println("Trapeze"+ ", big basis length="+((Trapeze) shapes.get(i)).getBigBasisLength()+ ", small basis length="+((Trapeze) shapes.get(i)).getSmallBasisLength() + ", height="+((Trapeze) shapes.get(i)).getHeight() + ", square=" + shapes.get(i).getSquare()+ ", color is " + shapes.get(i).getColor());
            } else if (shapes.get(i).getClass().equals(Triangle.class)){
                System.out.println("Triangle"+ ", first side length="+((Triangle) shapes.get(i)).getFirstSideLength() + ", second side length="+((Triangle) shapes.get(i)).getSecondSideLength() + ", third side length="+((Triangle) shapes.get(i)).getThirdSideLength() + ", square=" + shapes.get(i).getSquare()+ ", color is " + shapes.get(i).getColor());
            } else  if (shapes.get(i).getClass().equals(Сircle.class)){
                System.out.println("Сircle"+ ", radius="+((Сircle) shapes.get(i)).getRadius() + ", square=" + shapes.get(i).getSquare()+ ", color is " + shapes.get(i).getColor());
            }
        }
    }
}
