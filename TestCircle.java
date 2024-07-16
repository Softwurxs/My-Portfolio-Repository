public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        Circle circle3 = new Circle();

        circle1.setRadius(2.5);
        circle2.setRadius(5.0);

        System.out.println("Circle 1 - Radius: " + circle1.getRadius() + ", Diameter: " + circle1.getDiameter() + ", Area: " + circle1.getArea());
        System.out.println("Circle 2 - Radius: " + circle2.getRadius() + ", Diameter: " + circle2.getDiameter() + ", Area: " + circle2.getArea());
        System.out.println("Circle 3 - Radius: " + circle3.getRadius() + ", Diameter: " + circle3.getDiameter() + ", Area: " + circle3.getArea());
    }
}
