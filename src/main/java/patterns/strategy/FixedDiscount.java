package patterns.strategy;

public class FixedDiscount implements DiscountStrategy {
    private final double discountAmount;

    public FixedDiscount(double discountAmount) {
        this.discountAmount = discountAmount;

    }
    @Override
    public double apply(double price) {
        return price - discountAmount;
    }
}
