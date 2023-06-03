package ReplitAssignment;

public class A75 {
    public static void main(String[] args){
        /*
        **For you to do:**

Using the following array.
{45, 78, 12,  67, 55, 89, 23, 77, 88}
Create a for loop to extract values from that array so your output looks as below:
**Expected Output:**
78 55 77
         */
        int [] nums = {45, 78, 12,  67, 55, 89, 23, 77, 88};
        for (int a=1; a<nums.length; a+=3)

        {
            System.out.print(nums[a]+" ");
        }
    }
}
