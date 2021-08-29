package pattern.iterator.n1Before;

public class IteratorN1BeforeMain {

    public static void main() {
        Menu menu = new Menu();
        Iterator<String> iterator = menu.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
