package project1;

class InvalidStaffIDException extends Exception {
    public InvalidStaffIDException(String message) {
        super(message);
    }
}

public class StaffLookupSystem {
    public static void main(String[] args) {
        try {
            if (args.length == 0) {
                System.out.println("Please enter a Staff ID:");
                return;
            }
            int staffID = Integer.parseInt(args[0]);
            checkStaffID(staffID);
            System.out.println("Valid Staff ID");
        } catch (InvalidStaffIDException e) {
            System.out.println("Please Reenter your valid Staff ID ");
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid number as Staff ID.");
        }
    }

    public static void checkStaffID(int id) throws InvalidStaffIDException {
        if (id < 0 || id > 999) {
            throw new InvalidStaffIDException("Invalid Staff ID");
        }
    }
}