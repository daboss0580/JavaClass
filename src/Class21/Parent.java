package Class21;

public class Parent {
    final void getMarried(){
        System.out.println("Marry Shakira");
    }
    void study(){
        System.out.println("Study medicine");
    }
}
class Axel extends Parent{
    void study(){
        System.out.println("SDET instead");
    }
}
