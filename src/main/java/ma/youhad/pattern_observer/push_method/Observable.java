package ma.youhad.pattern_observer.push_method;

public interface Observable {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifyObservers();

}
