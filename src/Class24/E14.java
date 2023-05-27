package Class24;

import java.util.ArrayList;

public class E14 {
    public static void main(String[] args) {
        ArrayList<Integer> numbs = new ArrayList<>();
        for (int i = 2; i <=500; i+=2) {
            numbs.add(i);
        }
        System.out.println(numbs);
        numbs.removeIf(y->y%5==0);
        System.out.println(numbs);
    }
}

