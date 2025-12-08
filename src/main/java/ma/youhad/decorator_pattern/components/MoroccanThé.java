package ma.youhad.decorator_pattern.components;

public class MoroccanThé extends Beverage {
    public MoroccanThé() {
        description = "Moroccan Thé";
    }

    @Override
    public double cost() {
        return 15;
    }
}
