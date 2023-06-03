package Class26;

import java.util.HashMap;
import java.util.Map;

public class E1Maps {
    public static void main(String[] args) {
        Map<String, Double>drinks=new HashMap<>();
        drinks.put("Coke", 2.95);
        drinks.put("Milk", 2.95);
        drinks.put("Juice", 0.95);
        drinks.put("Coffee", 1.95);
        drinks.put("Tea", 1.45);
        drinks.keySet().removeIf(x->x.contains("i"));
        System.out.println(drinks);
        drinks.values().removeIf(x->x>2.5);
        System.out.println(drinks);
    }
}
