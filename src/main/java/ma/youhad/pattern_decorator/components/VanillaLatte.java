package ma.youhad.pattern_decorator.components;

public class VanillaLatte extends Beverage {
    public VanillaLatte() {
        description = "Vanilla Latte";
    }

    @Override
    public double cost() {
        return 12;
    }
}
