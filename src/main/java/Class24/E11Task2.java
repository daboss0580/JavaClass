package Class24;

import java.util.ArrayList;

public class E11Task2 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Jane");
        names.add("Peter");
        names.add("Johne");
        names.add("Tony");
        names.add("Ken");
        names.add("Kenee");

       names.replaceAll(x->x.endsWith("e")||x.contains("a")?"Water":x);
        System.out.println(names);
    }

}
