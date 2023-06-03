package Class12;

public class E11 {
    public static void main(String[] args) {
        //Password should be minimum 8 characters, if less → message=”Password is too short”.
        String userName="admin";
        String password="pass123";
        if (password.length()<8){

            System.out.println("Password is too short");
        }
    }
}
