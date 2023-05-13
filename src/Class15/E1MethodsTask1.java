package Class15;

public class E1MethodsTask1 {
    static void par(int x, int y) {
        if (x < y) {
            System.out.println("The largest number is " + y);
        } else System.out.println("The largest number is " + x);
    }

    public static void main(String[] args) {
        par(8, 6);
    }
}
