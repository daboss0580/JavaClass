package HW280523;

import java.util.LinkedHashSet;
import java.util.Set;

public class HW3 {
    /*
    Create the collection that will store single uniques Objects of a String type in which order is preserved.
Write a logic to concatenate all string from the collection.
     */
    public static void main(String[] args) {
        Set<String> obj=new LinkedHashSet<>();
        obj.add("Rice");
        obj.add("Yam");
        obj.add("Potato");
        obj.add("Beans");
        String all="";
        for (String conc:obj){
            all=conc+all;

        }
        System.out.println(all);
    }
}
