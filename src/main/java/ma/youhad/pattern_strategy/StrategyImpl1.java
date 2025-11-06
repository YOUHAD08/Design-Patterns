package ma.youhad.pattern_strategy;

public class StrategyImpl1 implements Strategy {
    @Override
    public void apply() {
        System.out.println("Applying strategy 1");
    }
}
