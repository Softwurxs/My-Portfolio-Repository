public abstract class GeometricFigure {
    protected double height;
    protected double width;
    protected String figureType;
    protected double area;

    public GeometricFigure(double height, double width, String figureType) {
        this.height = height;
        this.width = width;
        this.figureType = figureType;
    }

    public abstract void calculateArea();

    public void display() {
        System.out.println("Figure Type: " + figureType);
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Area: " + area);
    }
}