package ReplitAssignment;

import java.util.Scanner;

public class A99 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String givenString = inp.nextLine();
        // System.out.println(givenString);
        //write your code below
        String reverse = "";
        for (int a = givenString.length() - 1; a >= 0; a--) {
            reverse += givenString.charAt(a);
            System.out.println(reverse);
        }
        boolean palindrome = true;
        for (int a = 0; a < givenString.length(); a++) {
            if (givenString.charAt(a) != reverse.charAt(a)) {
                palindrome = false;
            }
        }
        if (palindrome) {
            System.out.println(true);

        } else {
            System.out.println(false);
        }
    }
}