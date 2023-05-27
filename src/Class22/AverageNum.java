package Class22;

public class AverageNum {
    /*

create a method to get the average of numbers from an array
     */
    public static void main(String[] args) {
        int[] arr = {12,14,3,8};
        System.out.println(num(arr));
    }
    public static int num(int[] x){
        int total=0;
        for (int a=0; a<x.length; a++){
            total+=x[a];

        }
        return total/ x.length;

    }
}
