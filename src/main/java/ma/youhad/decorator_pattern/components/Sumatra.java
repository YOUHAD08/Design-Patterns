package ma.youhad.decorator_pattern.components;

public class Sumatra extends Beverage {
    public Sumatra() {
        description = "Sumatra";
    }

    @Override
    public double cost() {
        return 6;
    }
}
