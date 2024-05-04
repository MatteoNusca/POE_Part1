
package matteo_nusca_st10440432_prog5121_poe;

//author Matteo Nusca ST10440432
public class User {
    //Variables within the user class
    private static String firstName;
    private static String lastName;
    private static String username;
    private static String password;
    
    public static void User(String firstName, String lastName, String userName, String passWord){
    firstName = User.firstName;
    lastName = User.lastName;
    userName = User.username;
    passWord = User.password;
}   
    
    //getters and setters    
    public static void setFirstName(String firstName) {
        User.firstName = firstName;
    }
    
    public static void setLastName(String lastName) {
        User.lastName = lastName;
    }

    public static void setUsername(String username) {
        User.username = username;
    }

    public static void setPassword(String password) {
        User.password = password;
    }

    public static String getFirstName() {
        return firstName;
    }

    public static String getLastName() {
        return lastName;
    }

    public static String getUsername() {
        return username;
    }
    
    public static String getPassword() {
        return password;
    }
}
