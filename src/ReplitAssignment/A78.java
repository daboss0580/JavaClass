package ReplitAssignment;

import java.util.Scanner;

public class A78 {
    public static void main(String[] args) {
        /*
        Create an int array of integers with a size of 5 and input values with Scanner.
Don't print prompt questions for a user.
Using loop print out each element of the array that should look like the output below
         */
        int ans=0;
        int [] nums=new int[5];
        Scanner input=new Scanner(System.in);
        nums[0]=input.nextInt();
        nums[1]=input.nextInt();
        nums[2]=input.nextInt();
        nums[3]=input.nextInt();
        nums[4]=input.nextInt();
        for (int a=0; a<nums.length; a++){

            System.out.println(nums[a]*10);

        }
    }
}
