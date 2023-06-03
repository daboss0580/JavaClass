package Class26;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Task2 {
    public static void main(String[] args) {
        Map<String,String> countries=new TreeMap<>();
        countries.put("Nigeria","Abuja");
        countries.put("UK","London");
        countries.put("France","Paris");
        countries.put("Ghana","Accra");
        countries.put("Egypt","Cairo");
        Set<Map.Entry<String, String>> entry=countries.entrySet();
        for (Map.Entry<String,String> entry1:entry){
            System.out.println(entry1);
            System.out.println(entry1.getValue());
            System.out.println("*************************************************");
        }
        Set<String>countryset=countries.keySet();
        for (String counriesnew:countryset){
            System.out.println(counriesnew);
        }
        for (String values:countries.values()){
            System.out.println(values);
        }
        System.out.println();
        for (var all:countries.entrySet()){
            System.out.println(all.getKey()+" "+all.getValue());
        }

    }

}
