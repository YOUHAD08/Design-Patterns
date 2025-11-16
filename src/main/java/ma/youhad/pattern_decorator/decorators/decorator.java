package ma.youhad.pattern_decorator.decorators;

import ma.youhad.pattern_decorator.components.Beverage;

public abstract class decorator extends Beverage {
    protected Beverage beverage;

    public decorator(Beverage beverage) {
        this.beverage = beverage;
    }
}
