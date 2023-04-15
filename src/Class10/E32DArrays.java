package Class10;

public class E32DArrays {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30},
                {20, 30, 74},
                {34, 63, 80}
        };
        int[] arr = matrix[0];
        for (int a = 0; a < arr.length; a++) {
            System.out.print(arr[a] + " ");
        }
        System.out.println();
        arr = matrix[1];
        for (int a = 0; a < arr.length; a++) {
            System.out.print(arr[a] + " ");

        }
        System.out.println();
        arr = matrix[2];
        for (int a = 0; a < arr.length; a++) {
            System.out.print(arr[a] + " ");
        }
    }
}
