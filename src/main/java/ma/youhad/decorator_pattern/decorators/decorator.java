package ma.youhad.decorator_pattern.decorators;

import ma.youhad.decorator_pattern.components.Beverage;

public abstract class decorator extends Beverage {
    protected Beverage beverage;

    public decorator(Beverage beverage) {
        this.beverage = beverage;
    }
}
