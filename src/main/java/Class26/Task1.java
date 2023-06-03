package Class26;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        Map<Integer,String>floor=new LinkedHashMap<>();
        floor.put(1,"Google");
        floor.put(2,"Syntax");
        floor.put(2,"Microsoft");
        floor.put(4,"PetroNas");
        floor.put(5,"Uber");
        floor.put(6,"Google");
        floor.put(7,"Uber");
        System.out.println(floor.size());
        System.out.println(floor);
        floor.replace(4,"PetroNas","Apple");
        floor.replace(6,"Google","Syntax");
        System.out.println(floor);
        floor.remove(7);
        System.out.println(floor);
    }
}
