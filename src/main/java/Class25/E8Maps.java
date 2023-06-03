package Class25;

import java.util.LinkedHashMap;

public class E8Maps {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String>ranks=new LinkedHashMap<>();
        ranks.put(1, "Tony");
        ranks.put(2, "John");
        ranks.put(3, "King");
        ranks.put(4, "Bally");
        ranks.put(5, "Akon");
        ranks.put(6, "Snoop");
        ranks.put(7, "Mel");
        System.out.println(ranks);
        ranks.remove(5);
        System.out.println(ranks);
        ranks.replace(1,"Adam");
        System.out.println(ranks);
    }
}
