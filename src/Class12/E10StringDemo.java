package Class12;

public class E10StringDemo {
    /*
    Store username, password and confirm password from a user and check following requirements:

    Username and Password cannot be  empty, if so→ message=”Username or Password cannot be empty”.
    Password should be minimum 8 characters, if less → message=”Password is too short”.
    Password cannot contain username if so, → message=”Password cannot contain username”.
    Password should match confirmed password, if not  → message=“Passwords do not match”.

    Only after all requirements met → message “Your username and password has been created”
     */
    public static void main(String[] args) {

        String userName="admin";
        String password="pass1234444";
        String confirmPassword="pass123";
        if (userName.isEmpty()&&password.isEmpty()) {
            System.out.println("Username or Password cannot be empty");
        } else if (password.length()<8) {
            System.out.println("Password is too short");

        } else if (password.contains(userName)) {
            System.out.println("Password cannot contain username");


        } else if (!password.equals(confirmPassword)) {
            System.out.println("Passwords do not match");

        }else {
            System.out.println("Login successful");
        }
    }
}
