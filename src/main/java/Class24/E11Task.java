package Class24;

import java.util.ArrayList;

public class E11Task {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Jane");
        names.add("Peter");
        names.add("Johne");
        names.add("Tony");
        names.add("Ken");
        names.add("Kenee");
      // names.removeIf((String word)->word.endsWith("e"));
     //  names.removeIf(word->word.endsWith("e"));
       names.removeIf(x->x.endsWith("e"));
        System.out.println(names);
    }

}
