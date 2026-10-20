package corejava;
import java.util.HashMap;
public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        students.put(101, "Gayathri");
        students.put(102, "Anjali");
        students.put(103, "Priya");
        System.out.println("Students: " + students);
        System.out.println("Student with ID 101: " + students.get(101));
        System.out.println("Contains ID 102: " + students.containsKey(102));
        students.remove(103);
        System.out.println("After removing ID 103: " + students);
        System.out.println("Number of students: " + students.size());
    }}