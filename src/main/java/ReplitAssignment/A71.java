package ReplitAssignment;

public class A71 {
    public static void main(String[] args){
        /*
        **For you to do:**

Write a program that creates an array of integers that stores the following values: 45,78, 12,  67, 55, 89, 23, 77, 88
Print only values that stored with even index including 0.
* **Output:**
45 12 55 23 88
         */
        int [] nums={45,78, 12,  67, 55, 89, 23, 77, 88};
        for (int a=0; a<nums.length; a+=2){
            System.out.print(nums[a]+" ");
        }
    }
}
