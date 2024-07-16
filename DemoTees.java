public class DemoTees {
    public static void main(String[] args) {

        TeeShirt tee1 = new TeeShirt();
        tee1.setOrderNumber(101);
        tee1.setSize("L");
        tee1.setColor("Red");

        TeeShirt tee2 = new TeeShirt();
        tee2.setOrderNumber(102);
        tee2.setSize("XXL");
        tee2.setColor("Blue");

        CustomTee customTee1 = new CustomTee();
        customTee1.setOrderNumber(201);
        customTee1.setSize("M");
        customTee1.setColor("Green");
        customTee1.setSlogan("Java Rocks!");

        CustomTee customTee2 = new CustomTee();
        customTee2.setOrderNumber(202);
        customTee2.setSize("XXXL");
        customTee2.setColor("Black");
        customTee2.setSlogan("Code with Passion!");

        System.out.println("Tee 1:");
        displayTeeDetails(tee1);
        System.out.println("\nTee 2:");
        displayTeeDetails(tee2);
        System.out.println("\nCustom Tee 1:");
        displayCustomTeeDetails(customTee1);
        System.out.println("\nCustom Tee 2:");
        displayCustomTeeDetails(customTee2);
    }

    public static void displayTeeDetails(TeeShirt tee) {
        System.out.println("Order Number: " + tee.getOrderNumber());
        System.out.println("Size: " + tee.getSize());
        System.out.println("Color: " + tee.getColor());
        System.out.println("Price: $" + tee.getPrice());
    }

    public static void displayCustomTeeDetails(CustomTee customTee) {
        System.out.println("Order Number: " + customTee.getOrderNumber());
        System.out.println("Size: " + customTee.getSize());
        System.out.println("Color: " + customTee.getColor());
        System.out.println("Price: $" + customTee.getPrice());
        System.out.println("Slogan: " + customTee.getSlogan());
    }
}