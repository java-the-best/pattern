package pattern.observer.observer;

public class Subscriber2 implements MyObservable {

    @Override
    public void callMe(String msg) {
        System.out.println("s2: " + msg);
    }
}
