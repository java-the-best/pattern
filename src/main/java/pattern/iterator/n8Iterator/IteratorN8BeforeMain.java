package pattern.iterator.n8Iterator;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class IteratorN8BeforeMain {

    public static void main() {
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            // исключение выбрасывает оператор next
            list.remove("one");
//            list.add("new");
        }
        System.out.println(list.size());
    }
}
