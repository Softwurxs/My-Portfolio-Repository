class CourseException extends Exception {
    public CourseException(String message) {
        super(message);
    }
}

class Course {
    private String department;
    private int courseNumber;
    private double credits;

    public Course(String department, int courseNumber, double credits) throws CourseException {
        if (department.length() != 3) {
            throw new CourseException("Invalid department format. Department should consist of three letters.");
        }

        if (courseNumber < 100 || courseNumber > 499) {
            throw new CourseException("Invalid course number. Course number should be between 100 and 499 inclusive.");
        }

        if (credits < 0.5 || credits > 6) {
            throw new CourseException("Invalid number of credits. Credits should be between 0.5 and 6.");
        }

        this.department = department;
        this.courseNumber = courseNumber;
        this.credits = credits;
        System.out.println("Course created successfully: " + department + courseNumber + " - " + credits + " credits");
    }

    public String getDepartment() {
        return department;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public double getCredits() {
        return credits;
    }
}

public class ThrowCourseException {
    public static void main(String[] args) {
        try {
            Course[] courses = new Course[6];
            courses[0] = new Course("CIS", 101, 3.0);
            courses[1] = new Course("ENG", 210, 4.0);
            courses[2] = new Course("MAT", 550, 5.0);
            courses[3] = new Course("BIO", 320, 2.0);
            courses[4] = new Course("CHE", 150, 0.2);
            courses[5] = new Course("PHI", 400, 7.0);
        } catch (CourseException e) {
            System.out.println("Error creating course: " + e.getMessage());
        }
    }
}