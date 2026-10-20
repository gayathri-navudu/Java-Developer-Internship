package corejava;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class StudentManagementSystem {
    static ArrayList<ProjectStudent> students = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static final String FILE_NAME = "students.txt";
    public static void main(String[] args) {
        loadStudents();
        System.out.println("Student records loaded.");
        int choice = 0;
        do {
            System.out.println("\n===== Student Record Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Update Student Marks");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Enter a number from 1 to 5.");
                scanner.nextLine();
                continue;
            }
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3 :
                    searchStudent();
                    break;
                case 4:
                    updateMarks();
                    break;
                case 5:
                    saveStudents();
                    System.out.println("Exiting application.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);
        scanner.close();
    }
    // Add a new student
    static void addStudent() {
        System.out.print("Enter student ID: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid student ID.");
            scanner.nextLine();
            return;
        }
        int id = scanner.nextInt();
        scanner.nextLine();
        if (id <= 0) {
            System.out.println("Student ID must be positive.");
            return;
        }
        for (ProjectStudent student : students) {
            if (student.getId() == id) {
                System.out.println("Student ID already exists.");
                return;
            }
        }
        System.out.print("Enter student name: ");
        String name = scanner.nextLine().trim();

        if (name.isEmpty() || name.contains(",")) {
            System.out.println(
                    "Name cannot be empty or contain commas."
            );
            return;
        }

        System.out.print("Enter marks (0-100): ");

        if (!scanner.hasNextDouble()) {
            System.out.println("Invalid marks.");
            scanner.nextLine();
            return;
        }

        double marks = scanner.nextDouble();

        if (marks < 0 || marks > 100) {
            System.out.println("Marks must be between 0 and 100.");
            return;
        }

        ProjectStudent student =
                new ProjectStudent(id, name, marks);

        students.add(student);

        System.out.println("Student added successfully.");
    }

    // Display all student records
    static void viewStudents() {

        if (students.isEmpty()) {
            System.out.println("No student records found.");
            return;
        }

        System.out.println("\n----- Student Records -----");

        for (ProjectStudent student : students) {
            student.displayDetails();
        }
    }

    // Search for a student using ID
    static void searchStudent() {

        System.out.print("Enter student ID to search: ");

        if (!scanner.hasNextInt()) {
            System.out.println("Invalid student ID.");
            scanner.nextLine();
            return;
        }

        int id = scanner.nextInt();

        for (ProjectStudent student : students) {
            if (student.getId() == id) {
                System.out.println("Student found:");
                student.displayDetails();
                return;
            }
        }

        System.out.println("Student not found.");
    }

    // Update a student's marks
    static void updateMarks() {

        System.out.print("Enter student ID: ");

        if (!scanner.hasNextInt()) {
            System.out.println("Invalid student ID.");
            scanner.nextLine();
            return;
        }

        int id = scanner.nextInt();

        for (ProjectStudent student : students) {
            if (student.getId() == id) {

                System.out.print("Enter new marks (0-100): ");

                if (!scanner.hasNextDouble()) {
                    System.out.println("Invalid marks.");
                    scanner.nextLine();
                    return;
                }

                double marks = scanner.nextDouble();

                if (marks < 0 || marks > 100) {
                    System.out.println(
                            "Marks must be between 0 and 100."
                    );
                    return;
                }

                student.setMarks(marks);

                System.out.println("Marks updated successfully.");
                return;
            }
        }

        System.out.println("Student not found.");
    }

    // Save all records to a text file
    static void saveStudents() {

        try (PrintWriter writer =
                     new PrintWriter(new FileWriter(FILE_NAME))) {

            for (ProjectStudent student : students) {
                writer.println(
                        student.getId() + ","
                                + student.getName() + ","
                                + student.getMarks()
                );
            }

            System.out.println("Student records saved successfully.");

        } catch (IOException e) {
            System.out.println(
                    "Error saving records: " + e.getMessage()
            );
        }
    }

    // Load saved records when the program starts
    static void loadStudents() {

        File file = new File(FILE_NAME);

        if (!file.exists()) {
            return;
        }

        try (Scanner fileScanner = new Scanner(file)) {

            while (fileScanner.hasNextLine()) {

                String line = fileScanner.nextLine();
                String[] data = line.split(",", 3);

                if (data.length == 3) {
                    try {
                        int id = Integer.parseInt(data[0]);
                        String name = data[1];
                        double marks = Double.parseDouble(data[2]);

                        if (id <= 0 || name.trim().isEmpty()
                                || marks < 0 || marks > 100) {
                            continue;
                        }

                        boolean exists = false;

                        for (ProjectStudent student : students) {
                            if (student.getId() == id) {
                                exists = true;
                                break;
                            }
                        }

                        if (!exists) {
                            students.add(
                                    new ProjectStudent(id, name, marks)
                            );
                        }

                    } catch (NumberFormatException e) {
                        System.out.println(
                                "Skipping invalid student record."
                        );
                    }
                }
            }

        } catch (IOException e) {
            System.out.println(
                    "Error loading records: " + e.getMessage()
            );
        }
    }
}
