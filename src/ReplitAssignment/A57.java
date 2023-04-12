package ReplitAssignment;

public class A57 {
    public static void main(String[] args) {
        //Create a for loop that prints out odd numbers from 5 to 22
        //
        //Must not include the number 22 in the output
        for (int start = 5; start < 22; start++) {
            if (start % 2 != 0) {
                System.out.println(start);
            }
        }
    }
}
