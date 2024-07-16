import java.util.Scanner;

public class Maier_Zachary_PaintCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the length of the room in feet:");
        double length = scanner.nextDouble();
        
        System.out.println("Enter the width of the room in feet:");
        double width = scanner.nextDouble();
        
        System.out.println("Enter the height of the room in feet:");
        double height = scanner.nextDouble();
        
        double wallArea = calculateWallArea(length, width, height);
        double gallonsNeeded = calculateGallonsNeeded(wallArea);
        double price = calculatePrice(gallonsNeeded);
        
        System.out.println("The cost to paint the room is: $" + price);
        
        scanner.close();
    }
    
    public static double calculateWallArea(double length, double width, double height) {
        double perimeter = 2 * (length + width);
        double wallArea = perimeter * height;
        return wallArea;
    }
    
    public static double calculateGallonsNeeded(double wallArea) {
        double gallonsNeeded = wallArea / 350.0;
        return Math.ceil(gallonsNeeded); // Round up to the nearest whole gallon
    }
    
    public static double calculatePrice(double gallonsNeeded) {
        final double PAINT_PRICE_PER_GALLON = 32.0;
        return gallonsNeeded * PAINT_PRICE_PER_GALLON;
    }
}
