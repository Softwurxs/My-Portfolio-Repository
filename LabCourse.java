public class LabCourse extends CollegeCourse {

    public LabCourse(String department, int courseNumber, int credits) {
        super(department, courseNumber, credits);
    }


    @Override
    public void display() {
        super.display();
        System.out.println("Course is a Lab Course.");
        System.out.println("Fee increased by $50.");
    }
}