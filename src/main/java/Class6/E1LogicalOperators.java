package Class6;

public class E1LogicalOperators {
    public static void main(String[] args) {
        boolean chocolates = false;
        boolean flowers = false;
        if (chocolates || flowers)
            System.out.println("I am happy");
        else {
            System.out.println("I am sad");

        }

        boolean fiveG = true;
        boolean wifi = false;
        if (fiveG || wifi) {
            System.out.println("you can browse the internet");
        } else System.out.println("Not connected to the internet");
    }
}
