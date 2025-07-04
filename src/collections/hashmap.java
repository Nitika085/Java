package collections;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class hashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> hs = new HashMap<>(Map.of(1, "a", 2, "b", 3, "c"));
        hs.put(4,"y");
        System.out.println(hs.get(8));
//        hs.clear();
        System.out.println(hs);
    }
}
