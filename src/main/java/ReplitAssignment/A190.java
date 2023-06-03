package ReplitAssignment;

import java.util.LinkedList;

public class A190 {
    /*
    Create Linked List that will store first 10 numbers of fibonacci series
Print number from Linked List 1 by 1 all in 1 line
**Expected Output:**
0 1 1 2 3 5 8 13 21 34
     */
    public static void main(String[] args) {
        LinkedList<Integer> linkedList=new LinkedList<>();

        int total=0, num1=0, num2=1;
        for (int a=0;a<10;a++){
            total=num1+num2;

            linkedList.add(num1);
            num1=num2;
            num2=total;
        }
        System.out.println(linkedList);
    }
}
