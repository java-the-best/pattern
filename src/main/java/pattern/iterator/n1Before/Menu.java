package pattern.iterator.n1Before;

public class Menu {
    private String[] items = {"one", "two"};

    public Iterator<String> getIterator() {
        return new Iterator<String>() {
            int i;
            @Override
            public boolean hasNext() {
                return i < items.length;
            }

            @Override
            public String next() {
                return items[i++];
            }
        };
    }
}
