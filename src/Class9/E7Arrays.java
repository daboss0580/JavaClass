package Class9;

public class E7Arrays {
    public static void main(String[] args) {
        boolean[] flags = {true, false, true, false, false, true};
        int sum = 0;
        for (int a = 0; a < flags.length; a++) {
           // if (flags[a] == false) or
            if (!flags[a]){

                sum++;
            }
        }System.out.println(sum);

    }
}


