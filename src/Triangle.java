public class Triangle extends ShapeColorGenerator implements Shape {
    private double firstSideLength;
    private double secondSideLength;
    private double thirdSideLength;
    private double minValue = 1;
    private double maxValue = 100;
    private Color color;

    public Triangle() {
        generateTriangle();
        color = generateColor();
    }

    @Override
    public void print() {
        System.out.println("Triangle was painted");
    }

    public Double getSemiPerimeter(){
        Double semiPerimeter = (getFirstSideLength()+getSecondSideLength()+getThirdSideLength())/2;
        return semiPerimeter;
    }

    @Override
    public Double getSquare() {
        Double semiPerimeter = getSemiPerimeter();
        Double square = Math.sqrt(semiPerimeter*(semiPerimeter-getFirstSideLength())*(semiPerimeter-getSecondSideLength())*(semiPerimeter-getThirdSideLength()));
        square = Double.valueOf(Math.round(square));
        return square;
    }

    @Override
    public Color getColor() {
        return color;
    }

    public void generateTriangle(){
        firstSideLength= (Double)Math.random() * (maxValue - minValue + 1) + minValue;
        firstSideLength = Math.round(firstSideLength);
        secondSideLength=(Double)Math.random() * (maxValue - minValue + 1) + minValue;
        secondSideLength = Math.round(secondSideLength);
        thirdSideLength= (Double)Math.random() * (maxValue - minValue + 1) + minValue;
        thirdSideLength = Math.round(thirdSideLength);
        if (firstSideLength>=secondSideLength+thirdSideLength||secondSideLength>=firstSideLength+thirdSideLength||thirdSideLength>=firstSideLength+secondSideLength){
            generateTriangle();
        }
    }

    public double getFirstSideLength() {
        return firstSideLength;
    }

    public double getSecondSideLength() {
        return secondSideLength;
    }

    public double getThirdSideLength() {
        return thirdSideLength;
    }
}
