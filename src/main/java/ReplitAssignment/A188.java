package ReplitAssignment;

import java.util.ArrayList;
import java.util.Scanner;

public class A188 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer>numbers=new ArrayList<>();
        int count=1;
        for (int a=0; a<5;a++){
        System.out.println("Enter numbers "+count);
        count++;
        numbers.add(input.nextInt());

        }
        System.out.println(numbers);

    }
}
