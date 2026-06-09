package patterns.strategy;

public class Main {
    public static void main(String[] args) {
        DiscountStrategy fixed = new FixedDiscount(200);
        DiscountStrategy percent = new PercentageDiscount(15);

        fixed.apply(1000);
        System.out.println(percent.apply(2000));
    }
}
