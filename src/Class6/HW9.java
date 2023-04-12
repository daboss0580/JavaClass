package Class6;


import java.util.Scanner;

public class HW9 {
    public static void main(String[] args) {
        double number1, number2;
        int mathematicalOperator;
        Scanner input =new Scanner(System.in);
        System.out.println("Please enter first number");
        number1=input.nextDouble();
        System.out.println("Please enter operator (1=+,2=-,3=*,4=/) any other number will return invalid");
        mathematicalOperator=input.nextInt();
        System.out.println("Please enter second number");
        number2=input.nextDouble();
        double answer=0;
        switch (mathematicalOperator){
            case 1:
                answer=number1+number2;
                break;
            case 2:
                answer=number1-number2;
                break;
            case 3:
                answer=number1*number2;
                break;
            case 4:
                answer=number1/number2;
                break;
            default:
                System.out.println("Invalid");
        }
        System.out.println("Your answer is "+answer);
    }
}
