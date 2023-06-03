package ReplitAssignment;

public class A182Person {
    /*
    Create the a Person class with the following:
**Class Variables**
- firstname
- lastname
- birthmonth
- birthday
- birthyear
- String ssn
**Constructor**
The main constructor should take in all values and assign them to their respective private class variables
**Methods**
Create a public getters to access all the variables.
**Create a public method called formatBirthday, which will return a String composed of their birthday in mm/dd/yyyy
format.  For example, if birthmonth=3, birthday=22, birthyear=2000, it should return the String "3/22/2000"**
in Main Class.
Instantiate and object of Person and provide values. follows below outputs for values.
using getter and method print them separately.
**Note: Read carefully the steps.**
**Expected Output:**
John
Doe
10/25/1900
123-45-6789
     */
    private String firstname;
    private String lastname;
    private String birthMonth;
    private String birthday;
    private String birthYear;
    private String  ssn;
    public A182Person(String firstname, String lastname, String ssn) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
    }

    public void getFirstname() {
        System.out.println(firstname);
    }

    public void getLastname() {
        System.out.println(lastname);
    }
    public void getSsn() {
        System.out.println(ssn);
    }
    public String formatBirthday(String DD, String MM, String YY){
        this.birthday=DD;
        this.birthYear=MM;
        this.birthYear=YY;
        String birthday=MM+"/"+DD+"/"+YY;
        return birthday;

    }
}
class A182PersonTester{
    public static void main(String[] args) {
        A182Person person=new A182Person("John","Doe","7465728747");
        person.getFirstname();
        person.getLastname();
        System.out.println(person.formatBirthday("25","04","1900"));
        person.getSsn();
    }
}
