package ma.youhad.pattern_strategy;

public class Test {
    public static void main(String[] args) {
        Context context = new Context();
        context.ApplyStrategy();
        context.setStrategy(new StrategyImpl1());
        context.ApplyStrategy();
        context.setStrategy(new StrategyImpl2());
        context.ApplyStrategy();
        context.setStrategy(new StrategyImpl1());
        context.ApplyStrategy();
        context.setStrategy(new StrategyImpl2());
        context.ApplyStrategy();


    }
}
