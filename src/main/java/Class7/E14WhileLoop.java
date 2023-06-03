package Class7;

import java.util.Scanner;

public class E14WhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int ans = input.nextInt();
        int first = 1;
        while (first <= ans) {
            if (first != 19) {
                if (first != 17)

                System.out.print(first + " ");

            }

            first += 2;
        }
    }

}