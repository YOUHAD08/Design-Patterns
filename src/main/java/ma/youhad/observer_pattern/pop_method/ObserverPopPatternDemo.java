package ma.youhad.observer_pattern.pop_method;

public class ObserverPopPatternDemo {
    public static void main(String[] args) {
        ObservableImpl observable = new ObservableImpl();
        Observer observer1 = new Observer_1();
        Observer observer2 = new Observer_2();
        observable.subscribe(observer1);
        observable.subscribe(observer2);
        observable.setState(10);
    }
}
