package ReplitAssignment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class A203 {
    public static void main(String[] args) {
        /*
        add values as below
map.put("mango", 10);
map.put("apple", 30);
map.put("orange", 20);
map.put("mango", 40);
 map.put("mango", 40);
Using iterator retrieve all keys and values if the format below:
**Expected Output:**
Key = orange and value = 20
Key = apple and value = 30
Key = mango and value = 40
         */
        Map<String, Integer> map = new HashMap<>();
        map.put("mango", 10);
        map.put("apple", 30);
        map.put("orange", 20);
        map.put("mango", 40);
        map.put("mango", 40);
        Iterator<Map.Entry<String, Integer>> keys = map.entrySet().iterator();
        while (keys.hasNext()) {
            Map.Entry<String, Integer> info = keys.next();
            System.out.println("Key = " + info.getKey() + " and value = " + info.getValue());

        }
        System.out.println();
        map.forEach((k, v) -> System.out.println("Key = " + k + " and value = " + v));
        System.out.println();
        for (Map.Entry<String, Integer> info1 : map.entrySet()) {
            System.out.println("Key = " + info1.getKey() + " and value = " + info1.getValue());

        }
        System.out.println();
        for (String a : map.keySet()) {
            System.out.println("Key = " + a + " and value = " + map.get(a));
        }
    }
}
