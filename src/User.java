public class User {

    public String username;
    public String password;

    public User(){
        System.out.println("Hello z konstruktora");

    }

    public void sayHello(){
        System.out.println("Hello my name is: " + username);
    }

}
