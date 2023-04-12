package Class6;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Input the current time");
        int ans=input.nextInt();
        if (ans>=1 && ans<=11) {
            System.out.println("Morning");
        } else if (ans >= 12 && ans <= 15) {
            System.out.println("Afternoon");
        } else if (ans >= 16 && ans <= 20) {
            System.out.println("Evening");
        } else if (ans >= 21 && ans <= 24) {
            System.out.println("Might");
        }
    }
}
