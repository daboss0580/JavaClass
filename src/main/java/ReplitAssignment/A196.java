package ReplitAssignment;

import java.util.HashSet;
import java.util.Set;

public class A196 {
    public static void main(String[] args) {
        /*
        Create a Set and and below values to it.
[third, first, second]
Print HashSet and then remove all the elements from Hashset and print it again.
**Expected Output:**
[third, first, second]
[]
         */
        Set<String>words=new HashSet<>();
        words.add("third");
        words.add("first");
        words.add("second");
        System.out.println(words);
        words.removeAll(words);
        System.out.println(words);
    }
}
