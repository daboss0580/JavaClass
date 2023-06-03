package Class24;

import java.util.ArrayList;

public class E13 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("coke");
        names.add("Fanta");
        names.add("Throphy");
        names.add("Palmy");
        names.add("Buzz");
        for (int i=0; i<names.size(); i++){
            String word=names.get(i);
            if (word.contains("a")||word.contains("e")){
                names.set(i,"Water");

            }
        }
        System.out.println(names);

    }

}
