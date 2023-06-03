package ReplitAssignment;

import java.util.Scanner;

public class A77 {
    public static void main(String[] args) {
        /*
        Create an array of integers that will store 5 elements taken from a user

Don't print any prompt message for the user

Then print out all the elements you have created in the first loop in reverse order.
         */
        Scanner scanner=new Scanner(System.in);
        int [] numbers=new int[5];
        numbers[0]=scanner.nextInt();
        numbers[1]=scanner.nextInt();
        numbers[2]=scanner.nextInt();
        numbers[3]=scanner.nextInt();
        numbers[4]=scanner.nextInt();
        for (int i = numbers.length-1; i >=0; i--)
        {System.out.println(numbers[i]);

        }
    }
}

