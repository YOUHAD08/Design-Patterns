package ma.youhad.pattern_decorator.decorators;

import ma.youhad.pattern_decorator.components.Beverage;

public class Milk extends decorator {
    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }


    @Override
    public double cost() {
        return 10 + beverage.cost();
    }
}
