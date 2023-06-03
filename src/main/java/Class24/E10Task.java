package Class24;

import java.util.ArrayList;
import java.util.Iterator;

public class E10Task {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Jane");
        names.add("Peter");
        names.add("Johne");
        names.add("Tony");
        names.add("Ken");
        names.add("Kenee");
        Iterator<String>iterator=names.iterator();
        while (iterator.hasNext()) {
            String word = iterator.next();
            if (word.endsWith("e")) {
                iterator.remove();
            }
        }


        System.out.println(names);
    }

}
