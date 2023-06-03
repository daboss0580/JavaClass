package Class16;

public class DogTester {
    public static void main(String[] args) {
       Dog dog1=new Dog();
       dog1.name="Jack";
       dog1.color="Black";
       dog1.breed="German";

       Dog dog2=new Dog();
       dog2.name="Koko";
       dog2.color="White";
       dog2.breed="Persian";

       dog2.printInfo();
       Dog.age=20;
       Dog.printInfo2();

    }

}
