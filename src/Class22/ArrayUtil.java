package Class22;

public interface ArrayUtil {
    public boolean searchArr(int [] array, int number);

}
class Main implements ArrayUtil{

    @Override
    public boolean searchArr(int[] arr, int num) {
        for (int a:arr){
            if (a==num){
                return true;
            }
        }
        return false;
    }
}
