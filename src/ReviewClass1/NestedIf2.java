package ReviewClass1;

public class NestedIf2 {
    public static void main(String[] args) {
        boolean vaccine = false;
        int dose = 3;
        if (vaccine) {
            if (dose == 1) {
                System.out.println("You need a dose");
            } else if (dose == 2) {
                System.out.println("You are fully vaccinated");
            } else if (dose == 3) {
                System.out.println("You are fully vaccinated with booster");
            }
        }else System.out.println("You need a vaccine");
    }
}