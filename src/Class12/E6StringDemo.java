package Class12;

public class E6StringDemo {
    public static void main(String[] args) {
        String name ="Justin";
        System.out.println(name.equals("Amber"));
        System.out.println(name.equals("Justin"));
        System.out.println(name.equalsIgnoreCase("JUSTIN"));
        System.out.println(!name.equalsIgnoreCase("JUSTIN"));
    }
}
