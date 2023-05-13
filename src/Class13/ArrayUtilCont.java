package Class13;

public class ArrayUtilCont {
    public static void main(String[] args) {
        int []arr= {10, 20, 45, 89};
        int []arr1={12,32,455,889};
        int []arr2={120,302,5,889};
        int num=100;
        int num1=10;
        int num2=10;

        ArrayUtilCont search=new ArrayUtilCont();
        search.searchNumber(arr,num);

    }
    void searchNumber(int []arr, int num){
        for (int a:arr){
            if (a == num) {
                System.out.println("yes");
                break;
            }
        }
    }

}
