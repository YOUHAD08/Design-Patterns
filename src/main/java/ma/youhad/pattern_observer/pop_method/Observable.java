package ma.youhad.pattern_observer.pop_method;

public interface Observable {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifyObservers();

}
