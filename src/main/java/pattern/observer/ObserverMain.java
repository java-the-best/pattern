package pattern.observer;

import pattern.observer.observer.Subject;
import pattern.observer.observer.Subscriber1;
import pattern.observer.observer.Subscriber2;
import pattern.observer.observer2.Subject2;
import pattern.observer.observer2.Subscriber3;
import pattern.observer.observer2.Subscriber4;

public class ObserverMain {

    public static void main() {
//        Subject subject = new Subject();
//        subject.subscribe(new Subscriber1());
//        subject.subscribe(new Subscriber2());
//        subject.notifySubscribers("hello world");
//        subject.unsubscribe(new Subscriber2());
//        subject.notifySubscribers("hello world");

        Subject2 subject2 = new Subject2();
        subject2.addObserver(new Subscriber3());
        subject2.addObserver(new Subscriber4());
        subject2.setChanged();
        subject2.notifyObservers("hi people");
    }
}
