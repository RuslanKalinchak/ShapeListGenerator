public class Сircle extends ShapeColorGenerator implements Shape {

    final double PI = 3.14;
    private double radius;
    private Color color;
    private double minValue = 1;
    private double maxValue = 100;

    public Сircle() {
        radius = generateCircle();
        color = generateColor();
    }

    @Override
    public void print() {
        System.out.println("Circle was painted");
    }

    @Override
    public Double getSquare() {
        double square = (getRadius()*getRadius())*PI;
        square = Math.round(square);
        return square;
    }

    @Override
    public Color getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }

    private Double generateCircle(){
        Double radius =  (Double)(Math.random() * (maxValue - minValue + 1) + minValue);
        radius = Double.valueOf(Math.round(radius));
        return radius;
    }
}
