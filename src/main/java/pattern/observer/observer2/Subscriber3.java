package pattern.observer.observer2;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Subscriber3 implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("s3: " + arg);
    }
}
