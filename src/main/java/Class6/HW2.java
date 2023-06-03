package Class6;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a number");
        int ans=input.nextInt();
        if (ans>=1 && ans<=10) {
            System.out.println("Small number");
        } else if (ans>=11 && ans<=100) {
            System.out.println("Medium number");} else if (ans>=101 && ans<=1000) {
            System.out.println("Large number");

        }

    }
    }

