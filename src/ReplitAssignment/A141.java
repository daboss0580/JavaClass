package ReplitAssignment;

public class A141 {
    //Create the maxValue method that will accept int array and return return the maximum value in the array
    public static void main(String[] args) {
        int[] arr = {5,12,-3,7,3,22};

        System.out.println(maxValue(arr)); //should print 22
    }

    static int maxValue(int []arr){
        int maxValue = 0;
        for (int a : arr) {
            if (a > maxValue) {
                maxValue = a;
            }

        }return maxValue;
    }
}

