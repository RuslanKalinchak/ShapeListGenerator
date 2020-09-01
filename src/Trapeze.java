public class Trapeze extends ShapeColorGenerator implements Shape {
    private double bigBasisLength;
    private double smallBasisLength;
    private double height;
    private Color color;
    private double minValue = 1;
    private double maxValue = 100;

    public Trapeze() {
        generateTrapeze();
        color = generateColor();
    }

    @Override
    public void print() {
        System.out.println("Trapeze was painted");
    }

    public Double getSquare() {
        double square = ((getBigBasisLength()+getSmallBasisLength())/2)*getHeight();
        square = Double.valueOf(Math.round(square));
        return square;
    }

    @Override
    public Color getColor() {
        return color;
    }

    public double getHeight() {
        return height;
    }

    public double getBigBasisLength() {
        return bigBasisLength;
    }

    public double getSmallBasisLength() {
        return smallBasisLength;
    }

    public void generateTrapeze (){
         double firstBasisLength =  (Double)(Math.random() * (maxValue - minValue + 1) + minValue);
         firstBasisLength = Math.round(firstBasisLength);
         double secondBasisLength =  (Double)(Math.random() * (maxValue - minValue + 1) + minValue);
         secondBasisLength = Math.round(secondBasisLength);

        height = (Double)(Math.random() * (maxValue - minValue + 1) + minValue);
        height = Math.round(height);

         if (firstBasisLength>secondBasisLength){
             bigBasisLength = firstBasisLength;
             smallBasisLength = secondBasisLength;
         } else if (firstBasisLength<secondBasisLength){
             bigBasisLength = secondBasisLength;
             smallBasisLength = firstBasisLength;
         } else if (firstBasisLength==secondBasisLength){
             generateTrapeze();
         }
    }

}
