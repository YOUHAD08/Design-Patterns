package ma.youhad.decorator_pattern.decorators;

import ma.youhad.decorator_pattern.components.Beverage;

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
