package ma.youhad.pattern_decorator.decorators;

import ma.youhad.pattern_decorator.components.Beverage;

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
