package ReplitAssignment;

import java.util.HashMap;
import java.util.Locale;

public class A205 {
    public static void main(String[] args) {
        HashMap<String,String >map=new HashMap<>();
        map.put("Street", "Patrick ST");
        map.put("Suite", "265");
        map.put("City", "Vienna");
        map.put("Zip", "22180");
        map.put("Country", "United State");
        for(String val:map.values()){
            System.out.println(val.toUpperCase(Locale.ROOT));
        }
    }
}
