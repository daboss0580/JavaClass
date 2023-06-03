package Class10;

public class E52DArrays {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30, 40, 50},
                {20, 30, 74, 30},
                {34, 63, 80},
                {52, 48}
        };
        for (int row = 0; row < matrix.length; row++) {

            for (int column = 0; column < matrix[row].length; column++){
                System.out.print(matrix[row][column]+" ");
            }
            System.out.println();
        }
    }
}
