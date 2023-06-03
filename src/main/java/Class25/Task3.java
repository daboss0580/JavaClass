package Class25;

import java.util.LinkedHashSet;

public class Task3 {
    public static void main(String[] args) {
        LinkedHashSet<String>cities=new LinkedHashSet<>();
        cities.add("Lagos");
        cities.add("London");
        cities.add("Salford");
        cities.add("Accra");
        cities.add("Kuala Lumpur");
        cities.add("Beijing");
        cities.add("Birmingham");
        cities.add("Bolton");
        System.out.println(cities);
        for (String city:cities){
            if (!city.startsWith("A")){
                System.out.println(city);
            }
        }
    }
}
