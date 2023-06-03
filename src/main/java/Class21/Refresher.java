package Class21;

public class Refresher {
    public static void main(String[] args) {
        int [] arr={10,20,30,40};
        for (int a:arr){
            System.out.println(a);
        }
        String [] names={"Vlad", "John", "James"};
        for (String b:names){
            System.out.println(b.length());
        }
        Dog1 dog=new Dog1("Tata", "White", "Mastif");
        Dog1[] dogs={dog,new Dog1("Koko", "Brown", "Buabel")};
        for (Dog1 dog1:dogs){
            dog1.printInfo();

        }
    }
}

