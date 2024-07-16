//Zachary Maier TestJobApplicant.java

public class TestJobApplicant {

    public static void main(String[] args) {
        JobApplicant applicant1 = new JobApplicant("Chris Watkins", "246-810-4326", true, true, false, true);
        JobApplicant applicant2 = new JobApplicant("Ridley Scott", "902-103-2765", true, true, true, false);
        JobApplicant applicant3 = new JobApplicant("John Force", "999-999-9999", true, false, true, false);
        printInterviewStatus(applicant1);
        printInterviewStatus(applicant2);
        printInterviewStatus(applicant3);
    }
    public static void printInterviewStatus(JobApplicant applicant) {
        System.out.println("Applicant Name: " + applicant.getName());
        System.out.println("Applicant Phone Number: " + applicant.getPhoneNumber());
        System.out.println("Is Applicant Qualified for Interview?: " + (applicant.isQualifiedForInterview() ? "Yes" : "No"));
        System.out.println();
    }
}
