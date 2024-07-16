import java.util.Scanner;

public class TimesAndInstructors {
    public static void main(String[] args) {

        String[][] courses = {
            {"IT1250", "Monday 9am", "Johnson"},
            {"MATH2200", "Tuesday 10am", "Smith"},
            {"ENG1101", "Wednesday 11am", "Brown"},
            {"CHEM1010", "Thursday 2pm", "Davis"},
            {"HIST2100", "Friday 1pm", "Williams"},

        };

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a course name: ");
        String courseName = scanner.nextLine();

        boolean courseExists = false;

        for (String[] course : courses) {
            if (course[0].equalsIgnoreCase(courseName)) {

                System.out.println("Course: " + course[0]);
                System.out.println("Time: " + course[1]);
                System.out.println("Instructor: " + course[2]);
                System.out.println();
                courseExists = true;
            }
        }

        if (!courseExists) {
            System.out.println("Error: Course not found.");
        }
    }
}