package Class24;

import java.util.ArrayList;

public class E8Task {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Adam");
        names.add("Peter");
        names.add("John");
        names.add("Tony");
        names.add("Ken");
        System.out.println(names.isEmpty());
        System.out.println(names.contains("John"));
        System.out.println(names.size());
        System.out.println(names);
    }
}
