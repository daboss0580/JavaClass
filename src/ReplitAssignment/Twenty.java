package ReplitAssignment;

import java.util.Scanner;

public class Twenty {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the length");
        int lenght = input.nextInt();
        System.out.println("Please enter the width");
        int width = input.nextInt();
        if (lenght == width) {
            System.out.println("The shape of your object is square");
        } else System.out.println("The shape of your object is rectangle");
    }
}
