package ReplitAssignment;

import java.util.LinkedHashMap;

public class A200 {
    /*
    Create A Map that will preserve an order of entry objects
Add below pairs :
"Street" = "Patrick ST"
"Suite" = "265"
"City" = "Vienna"
"Zip" = "22180"
"Country" = "United State"
Print all values of from the map
     */
    public static void main(String[] args) {
        LinkedHashMap<String, String> info=new LinkedHashMap<>();
        info.put("Street", "Patrick ST");
        info.put("Suite", "265");
        info.put("City", "Vienna");
        info.put("Zip", "22180");
        info.put("Country", "United State");
        for (String a:info.values()){
            System.out.println(a);
        }
    }
}
