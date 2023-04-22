package Class12;

public class E12 {
    public static void main(String[] args) {
        //Password cannot contain username if so, → message=”Password cannot contain username”.
        String userName="admin";
        String password="pass123";
        if (password.length()<8){

            System.out.println("Password is too short");
        }
    }
}
