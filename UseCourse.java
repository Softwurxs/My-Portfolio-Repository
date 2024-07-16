import java.util.Scanner;

public class UseCourse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter department: ");
        String department = scanner.nextLine().toUpperCase();
        System.out.print("Enter course number: ");
        int courseNumber = scanner.nextInt();
        System.out.print("Enter number of credits: ");
        int credits = scanner.nextInt();

        if (department.equals("BIO") || department.equals("CHM") ||
            department.equals("CIS") || department.equals("PHY")) {

            LabCourse course = new LabCourse(department, courseNumber, credits);

            System.out.println("\nCourse Information:");
            course.display();
        } else {

            CollegeCourse course = new CollegeCourse(department, courseNumber, credits);

            System.out.println("\nCourse Information:");
            course.display();
        }
    }
}
