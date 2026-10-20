package corejava;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class StudentFileManager {
    public static void main(String[] args) {
        String fileName = "student_data.txt";
        // Write data to file
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("Name: Gayathri\n");
            writer.write("Role: Java Developer Intern\n");
            writer.write("Skill: Core Java\n");
            writer.close();
            System.out.println("Student data saved successfully.");
        } catch (IOException e) {
            System.out.println("Error while writing file.");
        }
        // Read data from file
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            System.out.println("\nStudent Details:");
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (IOException e) {
            System.out.println("Error while reading file.");
        }
    }
}
