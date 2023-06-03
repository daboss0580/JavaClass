package GroupExcercise;

public class Registration {
    /*
    Create Registration Class in which you would have variables as
email, userName and password that have an access scope only
within its own class. After creating an object of the class user should
be able to call methods and in each method separately pass values
to set users email, username and password.
Requirements:
A. Valid email consider to be only yahoo
B. Valid userName and password cannot be empty and should be of
length larger than 6 characters. Also valid password cannot contain
userName
     */
    private String email;
    private String userName;
    private String password;

    public String getEmail() {
        return email;
    }

    void setEmail(String email){
        if (email.contains("@yahoo.com"))this.email=email;
        else {
            System.out.println("Only emails@yahoo.com are accepted");
        }

    }
    public String getUserName(){
        return userName;
    }
    void setUserName(String userName){
        if (userName.length() >7 && !userName.isEmpty()){
            this.userName=userName;

        }else
        {
            System.out.println("Username cannot be less than 7 Characters");
        }
    }
    public String getPassword(){
        return password;
    }
    void setPassword(String password){
        if ( !password.contains(userName)&&!password.isEmpty()&&password.length()>7)
        {
            this.password=password;

        }else {
            System.out.println("Password cannot contain username and cannot be less than 7 Characters");
        }

    }

    public static void main(String[] args) {
        Registration user=new Registration();
        user.setEmail("khnfrkv@yahoo.com");
        user.setUserName("ieirk97428");
        user.setPassword("ieirk97428krjkre34367");
        System.out.println(user.getEmail());
        System.out.println(user.getUserName());
        System.out.println(user.getPassword());


    }
}
