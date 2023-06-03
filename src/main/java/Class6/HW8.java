package Class6;

import java.util.Scanner;

import static javax.management.Query.*;

public class HW8 {
    private static void plus(int firstNumber, int secondNumber) {
        System.out.println(firstNumber + secondNumber);
    }

    private static void minus(int firstNumber, int secondNumber) {
        System.out.println(firstNumber - secondNumber);
    }

    private static void multiply(int firstNumber, int secondNumber) {
        System.out.println(firstNumber * secondNumber);
    }
    private static void div(double firstNumber, double secondNumber) {
        System.out.println(firstNumber / secondNumber);
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first number");
        int firstNumber = input.nextInt();
        System.out.println("Please enter operator (+,-,*,/)");
        String operator = input.next();
        System.out.println("Please enter second number");
        int secondNumber = input.nextInt();
        if (operator.equals("+")) {
            plus(firstNumber, secondNumber);
        } else if (operator.equals("-")) {
            minus(firstNumber, secondNumber);
        } else if (operator.equals("*")) {
            multiply(firstNumber, secondNumber);
        } else if (operator.equals("/")) {
            div(firstNumber, secondNumber);
        }
else System.out.println("Invalid operator");
    }

}



