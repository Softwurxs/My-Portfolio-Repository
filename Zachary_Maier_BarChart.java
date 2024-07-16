import java.util.Scanner;

public class Zachary_Maier_BarChart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] points = new int[5];
        String[] players = {"Art", "Bob", "Cal", "Dan", "Eli"};

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the points scored by " + players[i] + ": ");
            points[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(players[i] + ": ");
            for (int j = 0; j < points[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
