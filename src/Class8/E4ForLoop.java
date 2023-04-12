package Class8;

public class E4ForLoop {
    public static void main(String[] args) {

        int num = 0;
        for (int number = 2; number <= 30; number++) {
            if (number % 2 == 0) {
                num = num + number;

            }
        }
        System.out.println(num);
    }
}