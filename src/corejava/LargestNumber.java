package corejava;

public class LargestNumber {
    public static void main(String[] args) {

        int first = 25;
        int second = 48;
        int third = 36;

        if (first >= second && first >= third) {
            System.out.println("Largest number: " + first);
        } else if (second >= first && second >= third) {
            System.out.println("Largest number: " + second);
        } else {
            System.out.println("Largest number: " + third);
        }
    }
}
