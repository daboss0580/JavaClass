package ReplitAssignment;

import java.util.LinkedList;
import java.util.List;

public class A194 {
    public static void main(String[] args) {
        List<String> countries = new LinkedList<>();
        countries.add("Armenia");
        countries.add("USA");
        countries.add("Kazakhstan");
        countries.add("Australia");
        countries.add("Pakistan");
        countries.add("Russia");
        countries.add("Azerbaijan");
        countries.removeIf(x->x.startsWith("A"));
        System.out.println(countries);
    }
}
