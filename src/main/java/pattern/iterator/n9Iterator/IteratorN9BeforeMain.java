package pattern.iterator.n9Iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IteratorN9BeforeMain {

    public static void main() {
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 10);
        map.put("two", 20);
        map.put("three", 30);

        Iterator<String> iterator = map.keySet().iterator();

        while (iterator.hasNext()) {
            System.out.println(map.get(iterator.next()));
            map.put("four", 40);
        }
    }
}
