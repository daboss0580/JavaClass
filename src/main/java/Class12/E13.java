package Class12;

public class E13 {
    public static void main(String[] args) {
        String name="LEANDRO";
        int counter=0;
        System.out.println(name.charAt(2));
        for (int a=0; a<name.length(); a++){
            if (name.charAt(a)=='R')
                counter++;
            System.out.print(name.charAt(a)+" ");
        }
        System.out.println();
        System.out.println(counter);
    }
}
