package ma.youhad.pattern_observer.pop_method;

public class Observer_2 implements Observer {
    @Override
    public void update(Observable observable) {
        int state = ((ObservableImpl) observable).getState();
        System.out.println("The Cosines of the state is : " + Math.cos(state) + "\n");
    }
}
