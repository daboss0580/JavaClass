package Class13;

public class E4StringDemo {
    public static void main(String[] args) {
        String data="Today is Sunday. We have Java class. We like Java";
        String [] arr=data.split("[.!?]");
        System.out.println(arr.length);
        System.out.println(arr[1].trim());
    }
}
