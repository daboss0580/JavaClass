package Class25;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Task1 {
    //Remove duplicates from Arraylist
    public static void main(String[] args) {
        List<String> alist=new ArrayList<>();
        alist.add("John");
        alist.add("Jane");
        alist.add("James");
        alist.add("Jasmine");
        alist.add("Jane");
        alist.add("James");
        LinkedHashSet<String> hashSet=new LinkedHashSet<>(alist);
        System.out.println(hashSet);
    }

}
