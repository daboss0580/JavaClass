package ReplitAssignment;

import java.util.Scanner;

public class A76 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] days = new String[7];
        for (int i = 0; i < 7; i++) {
            System.out.println("Please enter day " + (i + 1) + " of the week");
            days[i] = scanner.nextLine();
        }
        for (String day : days) {
            System.out.println(day);
        }

    }
}

