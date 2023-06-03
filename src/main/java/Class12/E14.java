package Class12;

public class E14 {
    public static void main(String[] args) {
        String name= "Today is Saturday";
       // System.out.println(name.indexOf('i'));
      // System.out.println(name.indexOf('a',4));
        int counter=0;
        for (int a=0; a<name.length(); a++){
            if (name.charAt(a)=='a'){
                System.out.print(a+" ");
                System.out.println();
                //System.out.print(name.charAt(a)+" ");
                System.out.println();
                counter++;

            }

        }System.out.println(counter);
    }
}
