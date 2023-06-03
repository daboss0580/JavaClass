package Class8;

public class E14 {
    public static void main(String[] args) {
        int sprint = 0;
        while (sprint < 4) {

            for (int a = 2; a <= 10; a = a + 2) {
                System.out.print(a + " ");
            }
            System.out.println();
            sprint++;
        }
    }
}