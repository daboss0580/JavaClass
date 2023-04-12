package ReviewClass3;

import java.util.Scanner;

public class WhileLoopScanner {
    public static void main(String[] args) {
        /*
        You need to ask user to enter number one by one until the user enters non interger value then loop stops
        Inside loop, we need to calculate the sum of all entered numbers.
         */
        Scanner input = new Scanner(System.in);
        int sum = 0;
        System.out.println("Please enter integer values");

        while (input.hasNextInt()) {
            int answer = input.nextInt();
            sum = sum + answer;
            //sum+=answer;


        }
        System.out.println("Sum is " +sum);
    }
}
