package project1;

public class DiscountCouponSystem {
    public static void main(String[] args) {
        try {
            if (args.length == 0) {
                throw new IllegalArgumentException("No coupon code provided.");
            }

            String couponCode = args[0];
            String validCoupon = "COUPON123";

            if (couponCode.equals(validCoupon)) {
                System.out.println("Coupon code applied successfully");
            } else {
                throw new Exception("Invalid Coupon Code");
            }

        } catch (Exception e) {
            System.out.println("Failed to apply coupon: " + e.getMessage());
        } finally {
            System.out.println("Thank you for shopping with us!!");
        }
    }
}