package ma.youhad.decorator_pattern;

import ma.youhad.decorator_pattern.components.Beverage;
import ma.youhad.decorator_pattern.components.VanillaLatte;
import ma.youhad.decorator_pattern.decorators.Caramel;
import ma.youhad.decorator_pattern.decorators.Chocolate;
import ma.youhad.decorator_pattern.decorators.Cream;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Beverage beverage;
        beverage = new VanillaLatte();
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());
        beverage = new Chocolate(beverage);
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());
        beverage = new Cream(beverage);
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());
        beverage = new Caramel(beverage);
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());
    }
}
