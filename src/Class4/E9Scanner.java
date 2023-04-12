package Class4;

import java.util.Scanner;

public class E9Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you hungry? Enter true or false");
        boolean hungry = scanner.nextBoolean();
        if (hungry) {
            System.out.println("Let's order pizza");
        } else {
            System.out.println("Let's practice java");
        }
    }
}
