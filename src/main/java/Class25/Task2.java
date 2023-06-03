package Class25;

import java.util.TreeSet;

public class Task2 {
    public static void main(String[] args) {
        TreeSet<String>countries=new TreeSet<>();
        countries.add("USA");
        countries.add("UK");
        countries.add("Nigeria");
        countries.add("Gabon");
        countries.add("France");
        countries.add("Spain");
        countries.add("UAE");
        countries.add("Portugal");
        countries.add("Canada");
        countries.add("Ukraine");
        System.out.println(countries);
        for (String country:countries){
            System.out.println(country);
        }

    }
}
