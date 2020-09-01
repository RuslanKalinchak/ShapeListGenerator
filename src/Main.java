import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ShapeList shapeList = new ShapeList();
        ArrayList <Shape> shapes = shapeList.generateShapeList();
      //  for (int i = 0; i < shapes.size(); i++) {
      //      System.out.println(shapes.get(i).getColor()+ "     "+(Double)shapes.get(i).getSquare());
      //  }

       // System.out.println(shapes);

       shapeList.printShapeList(shapes);
    }
}
