package ReplitAssignment;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class A202 {
    public static void main(String[] args) {
        /*
        Create Map in which we want to store keys in Ascending order
Add the below values
1 item = apple
2 item = banana
3 item = pear
4 item = tomato
5 item = mango
6 item: kiwi
Extract all keys and it values and print them in the format below:
         */
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "apple");
        map.put(2, "banana");
        map.put(3, "pear");
        map.put(4, "tomato");
        map.put(5, "mango");
        map.put(6, "kiwi");
        Iterator<Map.Entry<Integer,String>> entry= map.entrySet().iterator();
        while (entry.hasNext()){
            Map.Entry<Integer,String>info=entry.next();
            System.out.println("Key is "+info.getKey()+" item and values is "+info.getValue());
        }
    }
}
