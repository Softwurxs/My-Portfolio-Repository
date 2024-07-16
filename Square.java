public class Square extends GeometricFigure {

    public Square(double side) {
        super(side, side, "Square");
    }

    @Override
    public void calculateArea() {
        area = height * width;
    }
}