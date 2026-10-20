package corejava;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("student.txt");

            writer.write("Name: Gayathri\n");
            writer.write("Role: Java Developer Intern\n");
            writer.write("Status: Learning Core Java");

            writer.close();

            System.out.println("Data written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
