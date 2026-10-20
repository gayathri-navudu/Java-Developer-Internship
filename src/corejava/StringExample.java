package corejava;
public class StringExample {

    public static void main(String[] args) {

        String name = "Java Developer";

        System.out.println("Original: " + name);
        System.out.println("Length: " + name.length());
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Contains Java: " + name.contains("Java"));
    }
}
