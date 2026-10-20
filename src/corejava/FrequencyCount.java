package corejava;
import java.util.HashMap;
public class FrequencyCount {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3, 1, 2, 4};
        HashMap<Integer, Integer> frequency = new HashMap<>();
        for (int number : numbers) {
            frequency.put(
                    number,
                    frequency.getOrDefault(number, 0) + 1
            );
        }
        System.out.println("Frequencies: " + frequency);
    }
}
