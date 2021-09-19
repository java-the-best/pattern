package pattern.memento;

import pattern.memento.memento.Originator;

import java.util.ArrayList;
import java.util.List;

public class MementoMain {

    public static void main() {
        List<Originator.Momento> list = new ArrayList<>();

        Originator originator = new Originator();
        originator.setState("one");
        list.add(originator.saveState());
        originator.setState("two");
        list.add(originator.saveState());
        originator.setState("three");
        System.out.println(originator.getState());
        originator.restoreFromMomento(list.get(1));
        System.out.println(originator.getState());
        originator.restoreFromMomento(list.get(0));
        System.out.println(originator.getState());
    }
}
