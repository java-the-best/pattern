package pattern.iterator.n6Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorN6BeforeMain {

    public static void main() {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            // исключение выбрасывает оператор next
//            list.remove("one");
            list.add("new");
        }
    }
}
