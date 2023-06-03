package Class6;

import java.util.Scanner;

public class HW7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter you grade from (A to D)");
        String answer = input.next();
        if (answer.equals("A")) {
            System.out.println("Excellent");
        } else if (answer.equals("B")) {
            System.out.println("Good");
        } else if (answer.equals("C")) {
            System.out.println("Average");
        } else if (answer.equals("D")) {
            System.out.println("Bad");
        } else System.out.println("Not acceptable");

    }
}
