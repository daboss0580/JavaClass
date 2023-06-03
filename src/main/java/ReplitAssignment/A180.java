package ReplitAssignment;

public class A180 {
    private String firstname;
    private String lastname;
    private int birthmonth;
    private int birthday;
    private int birthyear;
    private String  ssn;

    A180(String firstname, String lastname, int birthmonth, int birthday, int birthyear, String ssn){
        this.firstname=firstname;
        this.lastname=lastname;
        this.birthmonth=birthmonth;
        this.birthday=birthday;
        this.birthyear=birthyear;
        this.ssn=ssn;

    }
    void printInfo(){
        System.out.println(firstname);
        System.out.println(lastname);
        System.out.println(lastname);
    }

    public A180(int birthmonth, int birthday, int birthyear) {

    }

    public A180 formatBirthday(){


        return new A180(birthmonth, birthday,birthyear);
    }
}
class A180Tester{
    public static void main(String[] args) {
        A180 test=new A180("John", "Doe", 10,25,1900,"123-45-6789");
        test.printInfo();
    }
}