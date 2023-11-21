package task2;
import java.util.Scanner;
public class LabClassUI {
    private LabClass labClass;

    public LabClassUI(LabClass labClass) {
        this.labClass = labClass;
    }

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Sort students");
            System.out.println("2. Find student by name");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    labClass.sort();
                    System.out.println("Students sorted successfully.");
                    break;
                case 2:
                    try {
                        System.out.print("Enter student's full name: ");
                        scanner.nextLine();
                        String fullName = scanner.nextLine();
                        Student student = labClass.findStudentByFullName(fullName);
                        System.out.println("Student found: " + student.getFullName());
                    } catch (StudentNotFoundException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 3);
    }

    public static void main(String[] args) {
        // Пример использования
        Student[] students = {
                new Student("John Doe"),
                new Student("Jane Doe"),
                new Student("Bob Smith")
        };

        LabClass labClass = new LabClass(students);
        LabClassUI labClassUI = new LabClassUI(labClass);
        labClassUI.displayMenu();
    }
}