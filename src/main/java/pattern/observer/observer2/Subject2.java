package pattern.observer.observer2;

import java.util.Observable;

public class Subject2 extends Observable {

    @Override
    public synchronized void setChanged() {
        super.setChanged();
    }
}
