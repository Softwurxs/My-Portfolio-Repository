
import java.util.Scanner;

public class DayOfTheWeek {
    public enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {
        System.out.println("Days of the Week:");
        for (Day day : Day.values()) {
            System.out.println(day);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter a day: ");
        String userInput = scanner.nextLine().toUpperCase();

        Day chosenDay = null;
        for (Day day : Day.values()) {
            if (day.toString().equalsIgnoreCase(userInput)) {
                chosenDay = day;
                break;
            }
        }

        if (chosenDay != null) {
            switch (chosenDay) {
                case SUNDAY:
                    System.out.println("Business Hours: 11am - 5pm");
                    break;
                case MONDAY:
                case TUESDAY:
                case WEDNESDAY:
                case THURSDAY:
                case FRIDAY:
                    System.out.println("Business Hours: 9am - 9pm");
                    break;
                case SATURDAY:
                    System.out.println("Business Hours: 10am - 6pm");
                    break;
                default:
                    System.out.println("Invalid day.");
            }
        } else {
            System.out.println("Invalid day.");
        }
    }
}