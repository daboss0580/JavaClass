package Class17;

public class Dog {
    String dogName;
    double dogWeight;
    private static String dogBreed="Mutt";


    public Dog(String dogName, double dogWeight){
        this.dogName=dogName;
        this.dogWeight=dogWeight;

    }
    public void dogInfo(){
        System.out.println(dogName+" "+dogBreed+" "+dogWeight);
    }
}
class DogTester{
    public static void main(String[] args ){
        Dog dog=new Dog("Tarzan", 50.0);
        Dog dog1=new Dog("Lucy", 50.0);
        dog.dogInfo();
        dog1.dogInfo();
    }
}