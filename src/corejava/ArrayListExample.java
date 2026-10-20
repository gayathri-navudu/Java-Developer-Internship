package corejava;
import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Gayathri");
        students.add("Anjali");
        students.add("Priya");
        students.add("Sowmya");
        System.out.println("Students: " + students);
        students.remove("Priya");
        System.out.println("After removing Priya: " + students);
        System.out.println("First student: " + students.get(0));
        System.out.println("Number of students: " + students.size());
    }}
