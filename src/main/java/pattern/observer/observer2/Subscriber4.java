package pattern.observer.observer2;

import java.util.Observable;
import java.util.Observer;

public class Subscriber4 implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("s4: " + arg);
    }
}
