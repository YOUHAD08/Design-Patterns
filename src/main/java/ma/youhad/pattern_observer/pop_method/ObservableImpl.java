package ma.youhad.pattern_observer.pop_method;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable {
    int state = 0;
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
            observer.update(this);
        }
    }

    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }

    public int getState(){
        return state;
    }
}
