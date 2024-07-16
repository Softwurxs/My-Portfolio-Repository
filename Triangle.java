public class Triangle extends GeometricFigure {

    public Triangle(double base, double height) {
        super(height, base, "Triangle");
    }

    @Override
    public void calculateArea() {
        area = (height * width) / 2;
    }
}