package ma.youhad.decorator_pattern.components;

public class VanillaLatte extends Beverage {
    public VanillaLatte() {
        description = "Vanilla Latte";
    }

    @Override
    public double cost() {
        return 12;
    }
}
