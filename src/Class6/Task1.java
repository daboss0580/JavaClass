package Class6;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your height in inches");
        int answer=input.nextInt();
        if (answer<60){
            System.out.println("Short");} else if (answer>=60 && answer<=72) {
            System.out.println("medium");}else System.out.println("Tall");
            
        }
    }

