package ma.youhad.strategy_pattern;

public class Context {
    private Strategy strategy = new DefaultStrategy();
    int score = 0;
    public void ApplyStrategy() {
        ++score;
        if (score > 3) {
            this.strategy=new StrategyImpl3();
        }
        System.out.println("-------------------------");
        strategy.apply();
        System.out.println("-------------------------");

    }
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
