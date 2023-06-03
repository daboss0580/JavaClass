package Class26;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        Map<Integer,String> item=new LinkedHashMap<>();
        item.put(7594855,"Printer");
        item.put(7394855,"TV");
        item.put(7594255,"Laptop");
        item.put(7194855,"Desktop");
        item.put(7564855,"Sound Bar");
        for (var items:item.entrySet()){
            System.out.println(items.getKey()+" "+items.getValue());
        }
    }

}
