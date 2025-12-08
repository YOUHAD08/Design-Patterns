package ma.youhad.strategy_pattern;

public class DefaultStrategy implements Strategy {
    @Override
    public void apply() {
        System.out.println("Applying Default Strategy");
    }
}
