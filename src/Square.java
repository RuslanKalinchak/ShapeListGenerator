import java.util.Random;

public class Square extends ShapeColorGenerator implements Shape {

    private double sideLength;
    private Color color;
    private double minValue = 1;
    private double maxValue = 100;

    public Square() {
        sideLength = generateSquare();
        color = generateColor();
    }

    @Override
    public void print() {
        System.out.println("Square was painted");
    }

    @Override
    public Double getSquare() {
        double square = getSideLength()*getSideLength();
        square = Math.round(square);
        return square;
    }

    public double getSideLength() {
        return sideLength;
    }

    @Override
    public Color getColor() {
        return color;
    }

    public Double generateSquare(){
        Double sideLength = (Double)(Math.random() * (maxValue - minValue + 1) + minValue);
        sideLength = Double.valueOf(Math.round(sideLength));
        return sideLength;
    }



}
