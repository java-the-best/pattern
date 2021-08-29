package pattern.iterator.n2Before;

public class IteratorN2BeforeMain {

    public static void main() {
        Menu menu = new Menu();
        Iterator<String> iterator = menu.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
