package ReplitAssignment;

import java.util.Scanner;

public class A104 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] names = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter names with more than 3 characters " + (i + 1));
            names[i] = input.next();
            if (names[i].length() < 4) {
                System.out.println("Invalid length of name");
            }
        }
        for (int j = 0; j < 5; j++) {
            System.out.println(names[j].substring(0, 3));
        }

    }

}
