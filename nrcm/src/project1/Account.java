package project1;
import java.util.*;

public class Account {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer as a string: ");
        String input = sc.next();
        try {
            int value = Integer.parseInt(input);
            System.out.println("Parsed value: " + value);
        } catch (NumberFormatException e) {
            System.out.println("Error: The input is not a valid integer.");
        } finally {
            sc.close();
        }
    }
}
