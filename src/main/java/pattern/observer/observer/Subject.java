package pattern.observer.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<MyObservable> list = new ArrayList<>();

    public void subscribe(MyObservable myObservable) {
        list.add(myObservable);
    }

    public void unsubscribe(MyObservable myObservable) {
        list.remove(myObservable);
    }

    public void notifySubscribers(String msg) {
        list.forEach(item -> item.callMe(msg));
    }
}
