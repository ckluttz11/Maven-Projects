public class Student {

    private String lName;
    private double GPA;
    private int currentCredits;
    private int totalCredits;
    private String fName;

    public Student (String fName, String lName, double GPA, int currentCredits, int totalCredits) {
        this.fName = fName;
        this.lName = lName;
        this.GPA = GPA;
        this.currentCredits = currentCredits;
        this.totalCredits = totalCredits;

    }

    // Getters & Setters
    public String getFName() {
        return fName;
    }

    public String getLName() {
        return lName;
    }

    public double getGPA() {
        return GPA;
    }

    public int getCurrentCredits() {
        return currentCredits;
    }

    public int getTotalCredits() {
        return totalCredits;
    }
}
