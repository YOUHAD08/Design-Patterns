package ma.youhad.pattern_strategy;

public class DefaultStrategy implements Strategy {
    @Override
    public void apply() {
        System.out.println("Applying Default Strategy");
    }
}
