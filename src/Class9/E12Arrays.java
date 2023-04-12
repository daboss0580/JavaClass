package Class9;

import java.util.Scanner;

public class E12Arrays {
    public static void main(String[] args) {
        int [] numbers=new int[7];
        Scanner input=new Scanner(System.in);
        for (int a=0; a<numbers.length; a++){
            System.out.println("Please enter numbers");
            numbers[a]=input.nextInt();

        }
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
