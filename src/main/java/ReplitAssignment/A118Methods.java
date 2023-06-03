package ReplitAssignment;

public class A118Methods {
    static void spaceOut(String name){
        for (int a=0; a<name.length();a++){
            System.out.print(name.charAt(a)+ " ");
        }

    }

    public static void main(String[] args) {
        spaceOut("Hello");
    }
}
