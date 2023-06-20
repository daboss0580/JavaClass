package ReplitAssignment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class A207 {
    public static void main(String[] args) {
        Map<String,String>map=new HashMap<>();
        map.put("ONE","AAA");
        map.put("TWO","BBB");
        map.put("THREE","CCC");
        map.put("FOUR","DDD");
        map.put("FIVE","EEE");
        Iterator<Map.Entry<String,String>> iterator=map.entrySet().iterator();
        System.out.println("HashMap Before Replace :");
        while(iterator.hasNext()){
            Map.Entry<String, String> maps=iterator.next();

            System.out.println(maps.getKey()+" : "+maps.getValue());

        }
        map.replace("THREE", "CCC","ASEL");
        map.replace("FIVE", "EEE","SUMAIR");
        System.out.println("------------------");
        System.out.println("HashMap After Replace :");
        for (Map.Entry<String, String>map1:map.entrySet()){
            System.out.println(map1.getKey()+" : "+map1.getValue());
        }

    }
}
