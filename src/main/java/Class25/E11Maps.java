package Class25;

import java.util.Collection;
import java.util.TreeMap;

public class E11Maps {
    public static void main(String[] args) {
        TreeMap<String, Integer> salary=new TreeMap<>();
        salary.put("Tony", 2300);
        salary.put("John", 4500);
        salary.put("King", 2800);
        salary.put("Bally",4000);
        salary.put("Akon",1800);
        salary.put("Snoop", 5000);
        salary.put("Mel", 4300);
        Collection<Integer> values= salary.values();
        values.removeIf(v->v>3000);
        System.out.println(salary);



    }
}
