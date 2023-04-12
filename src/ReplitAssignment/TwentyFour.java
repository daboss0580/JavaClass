package ReplitAssignment;

import java.util.Objects;
import java.util.Scanner;

public class TwentyFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your gender: M or F");
        char ans = input.next().charAt(0);
        System.out.println("Please enter your age");
        int age = input.nextInt();
        {
            if (age >= 25)
                if (ans == 'F')
                    System.out.println("woman");
                else System.out.println("Man");


        }
        if (age<25)
            if (ans=='F')
                System.out.println("Girl");
        else System.out.println("Boy");
    }
}