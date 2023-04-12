package Class6;

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your birth month");
        String ans = input.next();
        if (ans.equals ("March") || ans.equals ("April") || ans.equals("May")) {
            System.out.println("You were born in Spring");
        } else if (ans.equals ("June") || ans.equals ("July") || ans.equals("August")) {
            System.out.println("You were born in Summer");
        } else if (ans.equals ("September") || ans.equals ("October") || ans.equals ("November")) {
            System.out.println("You were born in Autumn");
        } else if (ans.equals ("December") || ans.equals ("January") || ans.equals ("February")) {
            System.out.println("You were born in Winter");
        }else System.out.println("Invalid");
    }
}
