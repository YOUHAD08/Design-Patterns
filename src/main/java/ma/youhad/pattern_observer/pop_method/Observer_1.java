package ma.youhad.pattern_observer.pop_method;

import java.util.ArrayList;
import java.util.List;

public class Observer_1 implements Observer {
    private List<Double> history = new ArrayList<>();
    @Override
    public void update(Observable observable) {
        int state = ((ObservableImpl) observable).getState();
        history.add((double) state);
        double sum = 0;
        for (Double value : history) {
            sum += value;
        }
        System.out.println("Average of the history is : " + sum / history.size() + "\n");
    }
}
