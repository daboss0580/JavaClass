package Class23;

import java.util.ArrayList;

public class E2Collections {
    public static void main(String[] args) {
        ArrayList<String>names=new ArrayList<>();
        names.add("Clifford");
        names.add("Julie");
        names.add("Sophia");
        names.add("John");
        names.add("Jim");
        names.add("Tony");
        names.add("Pal");
        names.add("Steve");
        System.out.println(names);
        System.out.println(names.size());
        System.out.println(names.contains("John"));
        System.out.println(names.get(2));
    }
}
