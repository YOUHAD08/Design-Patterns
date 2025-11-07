package ma.youhad.pattern_observer.push_method;

public class Observer_2 implements Observer {
    @Override
    public void update(int state) {
        System.out.println("The Cosines of the state is : " + Math.cos(state) + "\n");
    }
}
