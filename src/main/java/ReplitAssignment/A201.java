package ReplitAssignment;

import java.util.HashMap;

public class A201 {
    public static void main(String[] args) {
        var info=new HashMap<>();
        info.put("Street", "Patrick ST");
        info.put("Suite", "265");
        info.put("City", "Vienna");
        info.put("Zip", "22180");
        info.put("Country", "United State");
        System.out.println(info.size());
        info.clear();
        System.out.println(info.size());
    }
}
