package ReplitAssignment;

import java.util.LinkedList;
import java.util.List;

public class A189 {
    /*
    Create a Linked List that will store Integer Objects from 50-100.
Once Linked List is created remove all numbers that are not divisible by 3.
Print Linked List
**Expected Output**
[51, 54, 57, 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99]
     */
    public static void main(String[] args) {
        List<Integer> numbers=new LinkedList<>();
        for (int a=50;a<=100;a++){
            numbers.add(a);
        }
        numbers.removeIf(x->x%3!=0);
        System.out.println(numbers);
    }

}
