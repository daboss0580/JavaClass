package ReplitAssignment;

import java.util.ArrayList;


public class A186 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(111);
        numbers.add(222);
        numbers.add(333);
        numbers.add(444);
        numbers.add(555);
        numbers.add(666);
        System.out.println(numbers);

        ArrayList<Integer> numbers1 = new ArrayList<>();
        numbers1.add(111);
        numbers1.add(222);
        numbers1.add(333);
        numbers1.add(444);
        numbers1.add(555);
        numbers1.add(666);
        numbers.removeAll(numbers1);
        System.out.println(numbers);

    }
}
