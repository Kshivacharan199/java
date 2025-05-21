package project1;

class AgeValidationException extends Exception {
    public AgeValidationException(String message) {
        super(message);
    }
}

class Person {
    private int age;

    public Person(int age) throws AgeValidationException {
        if (age <= 0) {
            throw new AgeValidationException("Age cannot be negative.");
        } else if (age > 100) {
            throw new AgeValidationException("Age cannot be greater than 100.");
        }
        this.age = age;
        System.out.println("Valid age.");
    }
}

public class UserSignupSystem {
    public static void main(String[] args) {
        try {
            if (args.length == 0) {
                throw new IllegalArgumentException("Please provide the age.");
            }

            int age = Integer.parseInt(args[0]);
            Person person = new Person(age);

        } catch (AgeValidationException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: Age must be a number.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}