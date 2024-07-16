public class UseGeometric {
    public static void main(String[] args) {

        GeometricFigure[] figures = new GeometricFigure[4];
        figures[0] = new Square(5.0);
        figures[1] = new Triangle(4.0, 3.0);
        figures[2] = new Square(3.0);
        figures[3] = new Triangle(6.0, 7.0);

        for (GeometricFigure figure : figures) {
            figure.calculateArea();
        }

        for (GeometricFigure figure : figures) {
            figure.display();
            System.out.println();
        }
    }
}