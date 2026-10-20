package corejava;
public class ExceptionExample {
    public static void main(String[] args) {
        try {
            int number = 10;
            int result = number / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }
        System.out.println("Program continues...");
    }
}