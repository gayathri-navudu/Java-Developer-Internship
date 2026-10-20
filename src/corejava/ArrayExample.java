package corejava;
public class ArrayExample {
    public static void main(String[] args) {

        int[] marks = {85, 90, 78, 92, 88};

        int total = 0;

        for (int mark : marks) {
            total += mark;
        }
        double average = (double) total / marks.length;

        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
    }
}
