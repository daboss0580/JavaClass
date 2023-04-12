package ReviewClass1;

public class NestedIf {
    public static void main(String[] args) {
        boolean dl = true;
        boolean car = true;
        if (dl) {
            System.out.println("Let's check if you have a car");
            if (car) {
                System.out.println("You can drive to work");
                if (car) {
                    System.out.println("the make of your car");
                } else System.out.println("You will need to take a bus");
                {

                }
            } else System.out.println("you should get a license");
        }
    }
}