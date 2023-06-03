package ReplitAssignment;

import java.util.ArrayList;

public class A184 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(111);
        numbers.add(222);
        numbers.add(333);
        numbers.add(444);
        numbers.add(555);
        numbers.add(666);
        for (int a = 0; a<numbers.size(); a+=2){
            System.out.println(numbers.get(a));
        }
    }

}
