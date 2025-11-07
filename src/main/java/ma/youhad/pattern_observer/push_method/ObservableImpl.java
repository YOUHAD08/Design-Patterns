package ma.youhad.pattern_observer.push_method;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable {
    private int state;
    private List<Observer> observers = new ArrayList<>();
    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(state);
        }
    }
    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }
}
