package ReplitAssignment;

import java.util.Scanner;

public class A100 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String s = inp.nextLine();
        //write your code below
        String reverse="";
        for (int a=s.length()-1; a>=0; a--){
            reverse+=s.charAt(a);
        }
        System.out.println(reverse);
    }
}
