package ReplitAssignment;

public class Practice {
    public static void main(String[] args) {
        for (int a = 0; a < 7; a++) {
            for (int b = 1; b < 8 - a; b++) {
                System.out.print(b + " ");
            }
            System.out.println();
        }

        for (int a = 0; a < 9; a++) {
            if (a == 0) {
                continue;
            }
            for (int b = 1; b < a; b++) {
                System.out.print(b + " ");
            }
            System.out.println();
        }

    }
}