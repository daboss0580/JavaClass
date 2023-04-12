package Class9;

public class E11Arrays {
    public static void main(String[] args) {
        // Another way of creating arrays
        int [] numbers=new int[5];
       /* numbers[0]=50;
        numbers[1]=60;
        numbers[2]=70;
        numbers[3]=80;
        numbers[4]=90;*/
int num=50;
        for (int a=0; a<numbers.length; a++ ) {
            numbers[a] = num;
            num = num + 10;
        }


        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
