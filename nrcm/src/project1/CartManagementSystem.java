package project1;

class StockLimitException extends Exception {
    public StockLimitException(String productName) {
        super("The " + productName + " cannot be ordered in quantities of more than 10 units.");
    }
}

class Cart {
    public void addItem(String productName, int quantity) throws StockLimitException {
        if (quantity > 10) {
            throw new StockLimitException(productName);
        } else {
            System.out.println(quantity + " units of " + productName + " added to the cart.");
        }
    }
}

public class CartManagementSystem {
    public static void main(String[] args) {
        try {
            if (args.length < 2) {
                throw new IllegalArgumentException("Please provide both product name and quantity.");
            }

            String productName = args[0];
            int quantity = Integer.parseInt(args[1]);

            Cart cart = new Cart();
            cart.addItem(productName, quantity);

        } catch (StockLimitException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Quantity must be a valid integer.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}