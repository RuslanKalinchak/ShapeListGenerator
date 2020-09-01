public  abstract class ShapeColorGenerator {
    public Color generateColor(){

        int colorNumber = (int) (Math.random() * (9 - 1 + 1) +1);
        if (colorNumber==1){
            return Color.BLACK;
        } else if (colorNumber==2){
            return Color.WHITE;
        } else if (colorNumber==3){
            return Color.RED;
        } else if (colorNumber==4){
            return Color.BLUE;
        } else if (colorNumber==5){
            return Color.GREEN;
        } else if (colorNumber==6){
            return Color.YELLOW;
        } else if (colorNumber==7){
            return  Color.ORANGE;
        } else if (colorNumber==8){
            return Color.VIOLET;
        } else return Color.PINK;
    }
}
