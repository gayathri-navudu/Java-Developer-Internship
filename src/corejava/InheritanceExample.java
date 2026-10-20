package corejava;
class Person {
    String name;
    void displayName() {
        System.out.println("Name: " + name);
    }
}
public class InheritanceExample extends Person {
    int age;
    void displayAge() {
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        InheritanceExample student = new InheritanceExample();
        student.name = "Gayathri";
        student.age = 21;
        student.displayName();
        student.displayAge();
    }
}
