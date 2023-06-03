package Class22;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = {12,14,3,8,8};
        System.out.println();
    }
    public static int num(int[] arr){
        int counter = 0;
        for (int a=0; a<arr.length; a++){
            if (arr[a]==8){
                counter++;
            }
        }
        return counter;
    }
}
