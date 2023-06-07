package ReplitAssignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class A206 {
    /*
    Create a Hash Map of String pairs
add the follow values
map.put("ONE","AAA");
map.put("TWO","BBB");
map.put("THREE","CCC");
map.put("FOUR","DDD");
map.put("FIVE","EEE");
Using entry set print key and values pairs using loop
Remove below from Map
"ONE"
"FOUR"
Using entry set print key and values pairs using loop
**Expected Output:**
HashMap Before Remove :
FIVE : EEE
ONE : AAA
FOUR : DDD
TWO : BBB
THREE : CCC
------------------
HashMap After Remove :
FIVE : EEE
TWO : BBB
THREE : CCC
     */
    public static void main(String[] args) {
        Map<String,String>map=new HashMap<>();
        map.put("ONE","AAA");
        map.put("TWO","BBB");
        map.put("THREE","CCC");
        map.put("FOUR","DDD");
        map.put("FIVE","EEE");
        Set<Map.Entry<String,String>> entry= map.entrySet();
        for (Map.Entry<String,String> b:entry){
            System.out.println(b.getKey()+" : "+b.getValue());
        }
        map.entrySet().removeIf(x->x.getKey().equals("ONE"));
        map.entrySet().removeIf(x->x.getKey().equals("FOUR"));
        for (String a:map.keySet()){
            System.out.println(a + " : " + map.get(a));
        }

    }
}
