package Class23;

public interface Person {
    void eat();
}
interface Employee extends Person{
    void work();
}
class Tester implements Employee{

    @Override
    public void eat() {
        System.out.println("Testers eats");
    }

    @Override
    public void work() {
        System.out.println("Testers make developers work harder");
    }
}