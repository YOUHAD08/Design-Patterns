package ma.youhad.pattern_strategy;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) throws Exception {
        Context context = new Context();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Which Strategy do you want to use?: ");
            String strategyName = scanner.nextLine();
            String fullClassName = "ma.youhad.pattern_strategy." + strategyName;
            Class strategyClass = Class.forName(fullClassName);
            Strategy strategy = (Strategy) strategyClass.newInstance();
            context.setStrategy(strategy);
            context.ApplyStrategy();

        }
    }
}
