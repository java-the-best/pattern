package pattern.observer.observer;

public class Subscriber1 implements MyObservable {

    @Override
    public void callMe(String msg) {
        System.out.println("s1: " + msg);
    }
}
