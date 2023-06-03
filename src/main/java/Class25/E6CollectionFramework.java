package Class25;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class E6CollectionFramework { public static void main(String[] args) {
    ArrayList<String> fruits=new ArrayList<>();
    fruits.add("Kiwi");
    fruits.add("Orange");
    fruits.add("Mango");
    fruits.add("Passion");
    fruits.add("passion");
    fruits.add("Passion");
    HashSet<String>hashSet=new HashSet<>(fruits);
    System.out.println(hashSet);
    LinkedList<String> linkedList=new LinkedList<>(hashSet);
    System.out.println(linkedList);

}
}
