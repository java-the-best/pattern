package pattern.iterator.n2Before;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<String> items = new ArrayList<>();

    public Menu() {
        items.add("one");
        items.add("two");
    }

    public Iterator<String> getIterator() {
        return new Iterator<String>() {
            int i;
            @Override
            public boolean hasNext() {
                return i < items.size();
            }

            @Override
            public String next() {
                return items.get(i++);
            }
        };
    }
}
