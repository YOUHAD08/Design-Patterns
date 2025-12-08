package ma.youhad.observer_pattern.pop_method;

public class Observer_2 implements Observer {
    @Override
    public void update(Observable observable) {
        int state = ((ObservableImpl) observable).getState();
        System.out.println("The Cosines of the state is : " + Math.cos(state) + "\n");
    }
}
