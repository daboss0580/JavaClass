package ReviewClass3;

public class SwitchStatement {
    public static void main(String[] args) {
        String colour = "RED";
        switch (colour.toLowerCase()) {
            case "red":
                System.out.println("Stop");
                break;
            case "orange":
                System.out.println("Yield");
                break;
            case "green":
                System.out.println("Go");
                break;
            default:
                System.out.println("Unknown colour");

        }
    }
}
