package ReplitAssignment;

import java.util.HashSet;

public class A195 {
    public static void main(String[] args) {
        HashSet<Integer>numbers=new HashSet<>();
        numbers.add(111);
        numbers.add(111);
        numbers.add(111);
        numbers.add(999);
        numbers.add(999);
        numbers.add(999);
        for (Integer nums:numbers){
            System.out.println(nums);
        }
    }
}
