package Class25;

import java.util.HashMap;

public class E7Maps {
    public static void main(String[] args) {
        HashMap<String, Double>grocery=new HashMap<>();
        grocery.put("Apple", 2.99);
        grocery.put("pineapple", 4.99);
        grocery.put("Orange", 0.99);
        grocery.put("Watermelon", 3.99);
        grocery.put("Eggs", 7.99);
        grocery.put("Tomatoes", 11.99);
        grocery.put("Yam", 13.99);
        grocery.put("Yam", 10.99);

        System.out.println(grocery);
        System.out.println(grocery.size());
        System.out.println(grocery.containsKey("Yam"));
        System.out.println(grocery.containsValue(2.99));
        System.out.println(grocery.isEmpty());
    }
}
