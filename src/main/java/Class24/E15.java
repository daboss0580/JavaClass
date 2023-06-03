package Class24;

import java.util.ArrayList;
import java.util.List;

public class E15 {
    public static void main(String[] args) {
        List<Integer>names=new ArrayList<>();
        names.add(10);
        names.add(40);
        names.add(60);
        names.add(120);
        names.add(105);
        names.add(70);
        names.add(180);
        System.out.println(names);
        names.add(1,500);
        System.out.println(names);

    }
}
