package Class9;

public class E4Arrays {
    public static void main(String[] args) {
        String [] names = {"Cliff", "John", "Tony", "Kelly", "Clive"};
        for (int a=0; a<names.length; a++){
            System.out.print(names[a]+" ");
        }
        System.out.println();
        int b=0;
        while (b<names.length){
            System.out.print(names[b]+" ");
            b++;
        }

    }
}
