package pattern.iterator.n7terator;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class IteratorN7BeforeMain {

    public static void main() {
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");

        list.forEach(str -> {
            System.out.println(str);
            list.remove(str);
//            list.add("new");
        });
        System.out.println(list.size());
    }
}
