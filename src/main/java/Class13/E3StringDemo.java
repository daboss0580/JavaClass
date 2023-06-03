package Class13;

public class E3StringDemo {
    public static void main(String[] args) {
        String data = "khgskfKHWKGHK139264!#@&^&$";
        System.out.println(data.replaceAll("[^a-z0-9]", "*"));
        System.out.println(data.replaceAll("[^a-z0-9]", " "));
        System.out.println(data.replaceAll("[^a-z0-9]", "\\$"));


    }
}
