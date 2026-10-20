package corejava;
public class StudentEncapsulation {
    private String name;
    private int age;
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public static void main(String[] args) {
        StudentEncapsulation student = new StudentEncapsulation();
        student.setName("Gayathri");
        student.setAge(21);
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
    }}
