package project1;
import java.util.*;

public class MathOperationException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the value of 'x': ");
            int x = sc.nextInt();

            System.out.println("Enter the value of 'y': ");
            int y = sc.nextInt();

            int outcome = x / y;
            System.out.println("Result of x/y: " + outcome);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Input Mismatch Exception: Please enter valid integer values.");
        } finally {
            sc.close();
        }
    }
}
        
    
