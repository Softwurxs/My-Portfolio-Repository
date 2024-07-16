public class UseDivision {
    public static void main(String[] args) {
        InternationalDivision intlDivision1 = new InternationalDivision("International1", "INTL123", "France", "French");
        InternationalDivision intlDivision2 = new InternationalDivision("International2", "INTL456", "Japan", "Japanese");

        DomesticDivision domDivision1 = new DomesticDivision("Domestic1", "DOM123", "New York");
        DomesticDivision domDivision2 = new DomesticDivision("Domestic2", "DOM456", "California");

        System.out.println("Division Information:");
        System.out.println("--------------------");
        intlDivision1.display();
        System.out.println();
        intlDivision2.display();
        System.out.println();
        domDivision1.display();
        System.out.println();
        domDivision2.display();
    }
}