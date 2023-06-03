package Class23;

public interface Movable {
    int age=12;
    void move();

}
interface Washable{
    void wash();
}
class Dog implements Movable, Washable{

    @Override
    public void move() {
        System.out.println("Dogs can move");

    }

    @Override
    public void wash() {
        System.out.println("Dogs are washable");
    }
}
class Cat implements Movable, Washable{

    @Override
    public void move() {
        System.out.println("Cats can also move");
    }

    @Override
    public void wash() {
        System.out.println("Cats are washable");
    }
}
class Horse implements Movable, Washable{
    public void move(){
        System.out.println("Horses can also move");
    }

    @Override
    public void wash() {
        System.out.println("Horses are washable");
    }
}
