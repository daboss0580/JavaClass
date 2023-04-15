package Class11;

public class E12DArray {
    public static void main(String[] args) {
        int [][] arr={{10, 20, 30, 40, 50},
                {1,2,3,4,5},
                {5, 5, 5, 5, 5},
                {10,8,6,4,2}};
        for (int row=0; row<arr.length; row++){
            for (int column=0; column<arr[row].length; column++){
                if (arr[row][column]%2==1)
                        System.out.println(arr[row][column]);


            }
        }
    }
}
