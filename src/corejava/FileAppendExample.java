package corejava;
import java.io.FileWriter;
import java.io.IOException;
public class FileAppendExample {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("student.txt", true);
            writer.write("\nExperience: Core Java Training");
            writer.close();
            System.out.println("Data appended successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

