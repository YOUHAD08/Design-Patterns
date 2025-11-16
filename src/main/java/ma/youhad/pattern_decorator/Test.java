package ma.youhad.pattern_decorator;

import ma.youhad.pattern_decorator.components.Beverage;
import ma.youhad.pattern_decorator.components.MoroccanThé;
import ma.youhad.pattern_decorator.components.VanillaLatte;
import ma.youhad.pattern_decorator.decorators.Caramel;
import ma.youhad.pattern_decorator.decorators.Chocolate;
import ma.youhad.pattern_decorator.decorators.Cream;

public class Test {
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
