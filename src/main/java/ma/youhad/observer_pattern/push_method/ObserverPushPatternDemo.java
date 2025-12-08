package ma.youhad.observer_pattern.push_method;

public class ObserverPushPatternDemo {
    public static void main(String[] args) {
        ObservableImpl observable = new ObservableImpl();

        Observer observer1 = new Observer_1();
        Observer observer2 = new Observer_2();

        observable.subscribe(observer1);
        observable.subscribe(observer2);

        observable.setState(10);
        System.out.println("-------------------------");
        observable.setState(20);
        System.out.println("-------------------------");

        observable.unsubscribe(observer1);
        System.out.println("-------------------------");
        observable.setState(30);

        observable.subscribe(new Observer(){
            @Override
            public void update(int state) {
                System.out.println("The Sinus of the state is : " + Math.sin(state) + "\n");
            }
        });
        System.out.println("****************************************");
        observable.setState(30);


        System.out.println("****************************************");
        observable.subscribe((state) -> {
                    System.out.println("The Tangent of the state is : " + Math.tan(state) + "\n");
                }
        );
        observable.setState(90);
    }

}
