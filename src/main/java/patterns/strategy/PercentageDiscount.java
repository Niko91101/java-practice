package patterns.strategy;

public class PercentageDiscount implements DiscountStrategy {
    private final double percent;

    public PercentageDiscount(double percent) {
        this.percent = percent;
    }
    @Override
    public double apply(double price) {
        return price - (price * percent / 100);
    }
}
