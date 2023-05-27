package ReplitAssignment;

public class A151 {
    public static int sum2D(){
        int[][] a = {

                { 1, 2, 3 },

                { 4, 5, 6 },

                { 7, 8, 9 }

        };
        int sum=0;
        for (int []b:a){
            for (int c:b){
                sum+=c;
            }
        }return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum2D());
    }
}
