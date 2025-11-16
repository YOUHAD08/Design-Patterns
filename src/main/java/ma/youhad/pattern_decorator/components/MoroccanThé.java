package ma.youhad.pattern_decorator.components;

public class MoroccanThé extends Beverage {
    public MoroccanThé() {
        description = "Moroccan Thé";
    }

    @Override
    public double cost() {
        return 15;
    }
}
