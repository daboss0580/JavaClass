package Class24;

import java.util.ArrayList;

public class E9Task {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Jane");
        names.add("Peter");
        names.add("Johne");
        names.add("Tony");
        names.add("Ken");
        names.add("Kenee");
        System.out.println(names);
        for (int i=0; i<names.size();i++){
String word=names.get(i);

if (word.endsWith("e")){
    names.remove(i);
    i--;
}
        }
        System.out.println(names);
    }
}
