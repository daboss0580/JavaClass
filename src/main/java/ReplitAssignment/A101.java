package ReplitAssignment;

import java.util.Scanner;

public class A101 {
    /*
    Write a for loop that will print out every other letter in a String, starting with the first letter.
    These letters should be printed all on one line with no space in between.
     */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below
        for (int a=0; a<word.length(); a+=2){

            System.out.println(word.charAt(a));

        }

    }
}
