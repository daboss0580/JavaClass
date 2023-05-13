package Class13;

public class ArrayUtil {
    public static void main(String[] args) {
        int []arr= {10, 20, 45, 89};
        int []arr1={12,32,455,889};
        int num1=10;
        int num2=10;
        for (int a:arr){
            if (a==num1) {
                System.out.println("Yes");
                break;

            }

        }
        for (int a:arr1){
            if (a==num2) {
                System.out.println("yes");
                break;
            }
        }

    }

}
