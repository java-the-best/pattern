package pattern.iterator.n10Iterator;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class IteratorN10BeforeMain {

    public static void main() {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put("one", 10);
        map.put("two", 20);
        map.put("three", 30);

        Iterator<String> iterator = map.keySet().iterator();

        while (iterator.hasNext()) {
            System.out.println(map.size());
            String next = iterator.next();
            System.out.println(map.get(next));
            System.out.println(next);
            map.put("four", 40);
        }
        System.out.println(map.size());
    }
}
