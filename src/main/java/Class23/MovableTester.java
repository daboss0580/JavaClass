package Class23;

public class MovableTester {
    public static void main(String[] args) {
        Movable movable=new Cat();
        Movable[] movables={new Cat(), new Dog(), new Horse()};
        Washable[] washables={new Cat(), new Dog(), new Horse()};
        for (Movable m:movables){
            m.move();
            for (Washable w:washables){
                w.wash();
            }
        }
    }
}
