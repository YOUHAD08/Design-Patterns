package ma.youhad.decorator_pattern.decorators;

import ma.youhad.decorator_pattern.components.Beverage;

public class Chocolate extends decorator {
    public Chocolate(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Chocolate";
    }

    @Override
    public double cost() {
        return 20 + beverage.cost();
    }
}
