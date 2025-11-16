package ma.youhad.pattern_decorator.decorators;

import ma.youhad.pattern_decorator.components.Beverage;

public class Cream extends decorator {
    public Cream(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Cream";
    }

    @Override
    public double cost() {
        return 10 + beverage.cost();
    }
}
