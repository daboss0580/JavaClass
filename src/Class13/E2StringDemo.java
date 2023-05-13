package Class13;

public class E2StringDemo {
    public static void main(String[] args) {
        String data="khgskfKHWKGHK139264!#@&^&$";
        System.out.println(data.replaceAll("[a-z]","*"));
        System.out.println(data.replaceAll("[A-Z]","@"));
        System.out.println(data.replaceAll("[A-Z]","@"));
        System.out.println(data.replaceAll("[0-9]","%"));
        System.out.println(data.replaceAll("[!-z]","%"));

        char c='A';

for (int i=0; i<20; i++){
    System.out.print(c+" ");
    c++;
}
    }
}
