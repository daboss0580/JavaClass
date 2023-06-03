package ReplitAssignment;

public class A113Methods {
    public static void main(String[] args) {
        numbers(3.5, 4.2);
    }
    public static void numbers(double x, double y) {
        int hours = (int) x;
        int minutes = (int) ((x - hours) * 60);
        System.out.println(hours + " hours and " + minutes + " minutes");
    }
}
