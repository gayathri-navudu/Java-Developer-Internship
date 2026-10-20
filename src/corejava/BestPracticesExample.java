package corejava;
public class BestPracticesExample {
    static int calculateTotal(int firstMark, int secondMark) {
        return firstMark + secondMark;
    }
    static void displayResult(String studentName, int totalMarks) {
        System.out.println("Student: " + studentName);
        System.out.println("Total Marks: " + totalMarks);
    }
    public static void main(String[] args) {
        String studentName = "Gayathri";
        int firstMark = 85;
        int secondMark = 90;
        int totalMarks = calculateTotal(firstMark, secondMark);
        displayResult(studentName, totalMarks);
    }}