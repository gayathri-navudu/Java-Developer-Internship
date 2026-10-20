package corejava;
public class StudentConstructor {
    String name;
    int age;
    StudentConstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        StudentConstructor student =
                new StudentConstructor("Gayathri", 21);
        student.displayDetails();
    }}
