interface CouponValidator {
    boolean validateCoupon(String code);

    static boolean isLengthValid(String code) {
        return code != null && code.length() >= 5;
    }
}

class ShoppingCart implements CouponValidator {
    public boolean validateCoupon(String code) {
        return CouponValidator.isLengthValid(code) && code.startsWith("SAVE");
    }

    public static void main(String[] args) {
        String[] coupons = {"SAVE10", "ABC", "SAVE50", "DISC20"};

        ShoppingCart cart = new ShoppingCart();

        for (String coupon : coupons) {
            System.out.println(coupon + " -> " +
                (cart.validateCoupon(coupon) ? "Valid" : "Invalid"));
        }
    }
}
