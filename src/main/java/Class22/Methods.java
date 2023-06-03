package Class22;

public class Methods {
    public int findNumber(int[] arr, int num) {
        int numAt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                numAt = i;
            }
        }
        return numAt;
    }
}
class MethodsTester {
    public static void main(String[] args) {
        Methods methods = new Methods();
        int[] arr = {12,14,3};
        System.out.println("Number found at index " + methods.findNumber(arr, 3));
    }
}