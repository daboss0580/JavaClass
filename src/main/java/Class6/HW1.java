package Class6;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter day in numbers '1-7' to represent Monday to Sunday respectively");
        int ans = input.nextInt();
        if (ans >= 1 && ans <= 5) {
            System.out.println("Weekday");
        } else if (ans > 5 && ans <= 7) {
            System.out.println("Weekend");
        } else System.out.println("Invalid day");

    }
}


