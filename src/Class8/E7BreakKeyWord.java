package Class8;

public class E7BreakKeyWord {
    public static void main(String[] args) {
        boolean summer = true;
        int temp = 85;
        while (summer) {
            if (temp < 100) {
                System.out.println("Its good I enjoy summer");
            } else {
                System.out.println("its very hot");
break;

            }
            temp = temp + 2;

        }
    }
}