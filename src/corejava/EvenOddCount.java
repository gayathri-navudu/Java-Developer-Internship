package corejava;
public class EvenOddCount {
    public static void main(String[] args) {
        int[] numbers = {10, 15, 22, 33, 40, 51};
        int even = 0;
        int odd = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even count: " + even);
        System.out.println("Odd count: " + odd);
    }
}