package Class26;

import java.util.*;

public class E2Maps {
    public static void main(String[] args) {
        Map<String, Double>drinks=new HashMap<>();
        drinks.put("Coke", 2.95);
        drinks.put("Milk", 2.95);
        drinks.put("Juice", 0.95);
        drinks.put("Coffee", 1.95);
        drinks.put("Tea", 1.45);
        Set<Map.Entry<String, Double>>entrySet= drinks.entrySet();
        //for (Map.Entry<String,Double>entry:entrySet){
          //  System.out.println(entry.getKey()+" "+entry.getValue());

        //}
        entrySet.removeIf(x->x.getKey().contains("u")&&x.getValue()<2);
            System.out.println(entrySet);


    }
}
