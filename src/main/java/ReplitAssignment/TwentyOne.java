package ReplitAssignment;

import java.util.Scanner;

public class TwentyOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first number");
        int num1 = input.nextInt();
        System.out.println("Please enter second number");
        int num2 = input.nextInt();
        if ((num1 * num2) > 0) {
            System.out.println("true");
        } else System.out.println("false");


    }
}
