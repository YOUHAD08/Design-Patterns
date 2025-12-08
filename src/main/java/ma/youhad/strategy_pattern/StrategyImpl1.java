package ma.youhad.strategy_pattern;

public class StrategyImpl1 implements Strategy {
    @Override
    public void apply() {
        System.out.println("Applying strategy 1");
    }
}
