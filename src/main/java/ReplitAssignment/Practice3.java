package ReplitAssignment;

public class Practice3 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int k = 1; k < 10; k++) {
                System.out.print("$");
                if(k >= i) {
                    break;
                }
            }
            System.out.println();
        }
    }
}
