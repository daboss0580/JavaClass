package ReplitAssignment;

import java.util.Scanner;

public class Thirteen {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=scanner.nextInt();
        int new1 = age + 10;
        System.out.println("Your age after 10 years is " +new1);
    }
}
