package corejava;
import java.util.HashSet;
public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> skills = new HashSet<>();
        skills.add("Java");
        skills.add("SQL");
        skills.add("Git");
        skills.add("Java");
        System.out.println("Skills: " + skills);
        System.out.println("Contains Java: " + skills.contains("Java"));
        skills.remove("Git");
        System.out.println("After removing Git: " + skills);
        System.out.println("Number of skills: " + skills.size());
    }
}