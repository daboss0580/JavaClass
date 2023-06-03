package Class13;

public class E7StringDemo {
    /*
    You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?”
    How would you find out how many sentences are in that String?
     */
    public static void main(String[] args) {
        String a="Is it saturday? Is it raining? Do we have a Java Class today?";
        String [] arr=a.split("[.!?]");
        System.out.println(arr.length);
    }
}
