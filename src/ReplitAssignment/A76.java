package ReplitAssignment;

import java.util.Scanner;

public class A76 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = new int[7];

        for (int a = 0; a < nums.length; a++) {
            System.out.println("Please enter day 1 of the week");
            nums[a] = input.nextInt();


        }
        for (int num1 : nums)
            if (num1 == 1) {
                System.out.println("Sunday");
            }else if (num1==2){
                System.out.println("Monday");
            }else if (num1==3) {
                System.out.println("Tuesday");
            }else if (num1==4) {
                System.out.println("Wednesday");
            }else if (num1==5) {
                System.out.println("Thursday");
            }else if (num1==6) {
                System.out.println("Friday");
            }else if (num1==7) {
                System.out.println("Saturday");
            }else System.out.println("Invalid");
    }

}

