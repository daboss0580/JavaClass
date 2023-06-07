package ReplitAssignment;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class A199 {
    /*
    Create a Set collection in which you want to preserve an order of inserted String Objects.
Add the below values
- null
- Sohil
- Diego
- Alijon
- Asel
- Sumair
Print values 1 by 1 using loop and Iterator
null
Sohil
Diego
Alijon
Asel
Sumair
null
Sohil
Diego
Alijon
Asel
Sumair
     */
    public static void main(String[] args) {
        LinkedHashSet<String>strings=new LinkedHashSet<>();
        strings.add("null");
        strings.add("Sohil");
        strings.add("Diego");
        strings.add("Alijon");
        strings.add("Asel");
        strings.add("Sumair");
        for (String names:strings){
            System.out.println(names);
        }
        Iterator<String>iterator= strings.iterator();
        while (iterator.hasNext()){
            String word=iterator.next();

            System.out.println(word);
        }

    }
}
