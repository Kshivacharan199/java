package project1;
import java.util.Scanner;

public class StudentGradeSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the student's name: ");
            String name = scanner.nextLine();

            if (name == null || name.trim().isEmpty()) {
                throw new NullPointerException("Name cannot be null.");
            }

            System.out.print("Enter the student's grade: ");
            String gradeInput = scanner.nextLine();

            int grade = Integer.parseInt(gradeInput);

            if (grade < 0 || grade > 100) {
                throw new IllegalArgumentException("Grade must be between 0 and 100.");
            }

            System.out.println("The grade has been successfully recorded.");

        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: The grade is not a valid integer.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}