package Class13;

public class Printer {
    void printSomething(){
        System.out.println("Hello Java");
        System.out.println("Hello Java");
        System.out.println("Hello Java");
        System.out.println("Hello Java");

        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");


    }
    void printName(String name){
        System.out.println(name);
        System.out.println(name);
        System.out.println(name);
        System.out.println(name);
        System.out.println(name);
    }
    void printMultipleName(String name, int iteration){
        for (int a=0; a<iteration; a++){
            System.out.println(name);
        }
    }
}
