package Class25;

import java.util.ArrayList;
import java.util.HashSet;

public class E3Sets {
    public static void main(String[] args) {
        ArrayList<String>names=new ArrayList<>();
        names.add("John");
        names.add("John");
        System.out.println(names);
        HashSet<String>uniqueNames=new HashSet<>();
        uniqueNames.add("Tony");
        uniqueNames.add("Rand");
        uniqueNames.add("Billy");
        uniqueNames.add("Andy");
        System.out.println(uniqueNames);
        for (String name:uniqueNames){
            System.out.println(name);
        }
    }
}
