package Class5;

import java.util.Scanner;

public class E3IFelse {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your age");
        int age=scanner.nextInt();
        if (age<18) {
            System.out.println("You can't drive");
        }else System.out.println("You can drive");
    }
}
