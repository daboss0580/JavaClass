package ReplitAssignment;

import java.util.Scanner;

public class Fourteen {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=scanner.next();
        System.out.println("Enter your mobile number(please use xxx-xxx-xxxx format)");
        String number=scanner.next();
        System.out.println("Enter your age");
        String age=scanner.next();
        System.out.println("Your name is " +name+", your age is "+age+ " and your mobile number is " +number+"");
    }
}
