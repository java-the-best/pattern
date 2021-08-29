package pattern.iterator.n6Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu implements Iterable<String> {
    private List<String> items = new ArrayList<>();

    public Menu() {
        items.add("one");
        items.add("two");
    }

    @Override
    public Iterator iterator() {
        return items.iterator();
    }
}
