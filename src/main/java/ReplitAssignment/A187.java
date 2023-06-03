package ReplitAssignment;

import java.util.ArrayList;

public class A187 {
    /*
    Create an array list to type String.
Add these values below to your arraylist
hi
yo
sup
yolo
boop
Remove 1, 3, 5 element from an array
print remained values one by one in one line     */
    public static void main(String[] args) {
        ArrayList<String> word = new ArrayList<>();
        word.add("hi");
        word.add("yo");
        word.add("sup");
        word.add("yolo");
        word.add("boop");
        word.removeIf(x->x.equals("hi")||x.equals("sup")||x.equals("boop"));
        System.out.println(word);
        for (String wds:word){
            System.out.print(wds+" ");
        }

    }
}
