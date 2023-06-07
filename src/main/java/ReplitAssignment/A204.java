package ReplitAssignment;

import java.util.LinkedHashMap;

public class A204 {
    /*
    Create a Map that will preserve an order of entry objects
Add below pair to it .
"Street" = "Patrick ST"
"Suite" = "265"
"City" = "Vienna"
"Zip" = "22180"
"Country" = "United State"
Print all values using iterator
**Expected output:**
Patrick ST
265
Vienna
22180
United State
     */
    public static void main(String[] args) {
        LinkedHashMap<String,String >map=new LinkedHashMap<>();
        map.put("Street", "Patrick ST");
        map.put("Suite", "265");
        map.put("City", "Vienna");
        map.put("Zip", "22180");
        map.put("Country", "United State");
        for (String info:map.values()){
            System.out.println(info);
        }
    }
}
