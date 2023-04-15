package ReplitAssignment;

import java.util.Scanner;

public class A77 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int [] numbers=new int[5];
        for (int i = 0; i <5 ; i++) {
            numbers[i]=scanner.nextInt();
        }for (int i = 4; i >=0; i--)
        {System.out.println(numbers[i]);

        }
    }
}

/*
import java.util.Scanner;
class Main {
  public static void main(String[] args){
    int[] elements = new int[5];
    Scanner scan = new Scanner(System.in);
    for(int i =0 ;i<5;i++){
      elements[i] = scan.nextInt();
    }
    for(int i =elements.length-1 ;i>=0;i--){
      System.out.println(elements[i]);
    }
  }

}
 */