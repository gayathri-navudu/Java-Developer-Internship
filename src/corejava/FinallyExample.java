package corejava;
public class FinallyExample {
    public static void main(String[] args) {
        try {
            int number = 10;
            int result = number / 2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        } finally {
            System.out.println("Finally block executed.");
        }
        System.out.println("Program continues...");
    }}

