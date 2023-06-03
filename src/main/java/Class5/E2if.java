package Class5;

import java.util.Scanner;

public class E2if {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("It's break time true/false");
        boolean answer = scanner.nextBoolean();
        if (answer) {
            System.out.println("Let's have a break");
        }else System.out.println("Let's continue the class");
        }
    }
