package ReviewClass1;

import java.util.Scanner;

public class NotScanner {
    public static void main(String[] args) {
        int i=10;
        Scanner key=new Scanner(System.in);
        System.out.println("Please enter 1 word");
        String ans=key.next();
        System.out.println("Word that was captured = "+ans);
    }
}
