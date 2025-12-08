package ma.youhad.observer_pattern.pop_method;

public interface Observable {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifyObservers();

}
