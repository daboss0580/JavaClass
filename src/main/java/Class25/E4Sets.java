package Class25;

import java.util.LinkedHashSet;

public class E4Sets {
    public static void main(String[] args) {
        LinkedHashSet<String>fruits=new LinkedHashSet<>();
        fruits.add("Kiwi");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Passion");
        fruits.add("passion");
        fruits.add("Passion");
        System.out.println(fruits);

    }
}
