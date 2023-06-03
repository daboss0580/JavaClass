package Class25;

public class InsuranceHW {
    /*
    Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as
    getQuote and cancelInsurance. Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute
    as carModel and Class Pet has petType attribute. Create 3 objects of the sub classes and store them
    in ArrayList. Using for loop/advanced for loop/ iterator access all methods of the class.
 Create a Card class that will have interest rate field and card type
  and a constructor that will initialize the fields.
  Create 3 objects of different card and store them into LinkedList.
  Using for loop/advanced for loop/ iterator access all methods of the class.
     */
    String insuranceName;

    public InsuranceHW(String insuranceName) {
        this.insuranceName = insuranceName;
    }
    public void getQuote(int monthDuration, double pricePerMonth){

    }
    public void cancelInsurance(){

    }
}
class Car1 extends InsuranceHW{

    public Car1(String insuranceName, double pricePerMonth) {

        super(insuranceName);
    }
    public void getQuote(int monthDuration, double pricePerMonth){
        double  fee=monthDuration*pricePerMonth;
        System.out.println(fee);
    }
    public void cancelInsurance(String cancelDate, double cancelFee){

    }
}
class Pet extends InsuranceHW{

    public Pet(String insuranceName) {
        super(insuranceName);
    }
    public void getQuote(int monthDuration, double pricePerMonth) {
        double fee = monthDuration * pricePerMonth;
        System.out.println(fee);
    }

    public void cancelInsurance(String cancelDate, double cancelFee){

    }
}
class Health extends InsuranceHW{

    public Health(String insuranceName) {
        super(insuranceName);
    }
    public void getQuote(int monthDuration, double pricePerMonth){
        double  fee=monthDuration*pricePerMonth;
        System.out.println(fee);
    }
    public void cancelInsurance(String cancelDate, double cancelFee){

    }
}