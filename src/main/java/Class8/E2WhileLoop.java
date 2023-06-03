package Class8;

import java.util.Scanner;

public class E2WhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter starting number, ending number and the step");
        int res1 = input.nextInt();
        int res2 = input.nextInt();
        int step=input.nextInt();
        int answer=res1;
        while (answer <= res2) {
            System.out.print(answer+" ");
            answer=answer+step;
        }
    }
}