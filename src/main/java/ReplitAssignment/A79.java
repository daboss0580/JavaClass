package ReplitAssignment;

public class A79 {
    public static void main(String[] args) {
        /*
        **For you to do:**
Write a program to print values from a 2D array
**Example Output:**
1.4 2.0 3.3 2.0
4.0 1.5 6.1 1.0
1.2 3.1 4.0 1.6
         */
        double [][] numb={{1.4, 2.0, 3.3, 2.0},
                {4.0, 1.5, 6.1, 1.0},
                {1.2, 3.1, 4.0, 1.6}
        } ;
        for (int a=0; a<numb.length; a++){
            for (int b=0; b<numb[a].length; b++){
                System.out.print(numb[a][b]+" ");

            }System.out.println();
        }
    }
}
