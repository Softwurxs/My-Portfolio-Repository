// Zachary Maier JobApplicant.java

public class JobApplicant {
    private String name;
    private String phoneNumber;
    private boolean skillWordProcessing;
    private boolean skillDatabase;
    private boolean skillSpreadsheets;
    private boolean skillGraphics;
    public JobApplicant(String name, String phoneNumber, boolean skillWordProcessing, boolean skillDatabase,
            boolean skillSpreadsheets, boolean skillGraphics) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.skillWordProcessing = skillWordProcessing;
        this.skillDatabase = skillDatabase;
        this.skillSpreadsheets = skillSpreadsheets;
        this.skillGraphics = skillGraphics;
    }
    public String getName() {
        return name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public boolean isSkillWordProcessing() {
        return skillWordProcessing;
    }
    public boolean isSkillDatabase() {
        return skillDatabase;
    }
    public boolean isSkillSpreadsheets() {
        return skillSpreadsheets;
    }
    public boolean isSkillGraphics() {
        return skillGraphics;
    }
    public boolean isQualifiedForInterview() {
        int skillsCount = 0;
        if (skillWordProcessing) {
            skillsCount++;
        }
        if (skillDatabase) {
            skillsCount++;
        }
        if (skillSpreadsheets) {
            skillsCount++;
        }
        if (skillGraphics) {
            skillsCount++;
        }
        return skillsCount >= 3;
    }
}
