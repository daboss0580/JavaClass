package Class10;

public class E42DArrays {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30},
                {20, 30, 74},
                {34, 63, 80}
        };

        for (int row = 0; row < matrix.length; row++) {
            int[] arr = matrix[0];
            for (int column = 0; column < arr.length; column++) {
                System.out.print(arr[column] + " ");
            }
            System.out.println();

        }
        for (int row = 0; row < matrix.length; row++) {
            int[] arr = matrix[row];
            for (int column = 0; column < arr.length; column++) {
                System.out.print(arr[column] + " ");
            }
            System.out.println();
        }
    }
}