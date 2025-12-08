package ma.youhad.decorator_pattern.decorators;

import ma.youhad.decorator_pattern.components.Beverage;

public class Caramel extends decorator {
    public Caramel(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Caramel";
    }

    @Override
    public double cost() {
        return 5 + beverage.cost();
    }
}
