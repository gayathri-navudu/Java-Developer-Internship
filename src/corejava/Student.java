package corejava;
public class Student {
    String name;
    int age;
    double cgpa;
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("CGPA: " + cgpa);
    }
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Gayathri";
        student.age = 21;
        student.cgpa = 8.73;
        student.displayDetails();
    }}
