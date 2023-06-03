package HW280523;

import java.util.ArrayList;
import java.util.List;

public class HW4 {
    /*
    Create a collection of integers in which you can keep duplicates.
Write a logic to find sum of all integers
     */
    public static void main(String[] args) {
        List<Integer> integers=new ArrayList<>();
        integers.add(4);
        integers.add(6);
        integers.add(7);
        integers.add(9);
        integers.add(3);
        integers.add(4);
        integers.add(4);
        int sum=0;
        for (Integer nums:integers){
            sum=nums+sum;
        }
        System.out.println(sum);
    }
}

