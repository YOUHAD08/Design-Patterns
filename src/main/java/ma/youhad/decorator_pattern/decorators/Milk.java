package ma.youhad.decorator_pattern.decorators;

import ma.youhad.decorator_pattern.components.Beverage;

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
