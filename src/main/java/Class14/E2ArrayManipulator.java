package Class14;

public class E2ArrayManipulator {
    int sumArr(int [] arr){
        int sum=-0;
        for (int num:arr){
            sum+=num;
        }
        return sum;
    }

    public static void main(String[] args) {
        E2ArrayManipulator res=new E2ArrayManipulator();
        int [] array={10,20,30};
        int result=res.sumArr(array);
        System.out.println(result);
    }
}
