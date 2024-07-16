public class TeeShirt {
    private int orderNumber;
    private String size;
    private String color;
    private double price;

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;

        if (size.equalsIgnoreCase("XXL") || size.equalsIgnoreCase("XXXL")) {
            this.price = 22.99;
        } else {
            this.price = 19.99;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }
}
