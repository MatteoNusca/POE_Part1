package matteo_nusca_st10440432_prog5121_poe;

import java.util.Scanner;

//author:   Matteo_Nusca_ST10440432
public class Login1 {
    //checking username
    
    public static void registerUser(){
        //calling methods
        UserInfo();
        checkUserName("");
        checkPasswordComplexity("");
    }
    
  public static boolean loginUser(){
    //variable declarations
    boolean Found1 = false;
    boolean Found2 = false;
    String UsernameInput ,  PasswordInput , StoredUsername , StoredPassword;
    //assign stored data to variables
    StoredUsername = User.getUsername();
    StoredPassword = User.getPassword();
    Scanner Input = new Scanner (System.in);
    System.out.println("Enter Username");
    //looping to confirm username
    while (!Found1) {
        UsernameInput = Input.nextLine();
        if (!UsernameInput.equals(StoredUsername)){
            System.out.println("Username inorrect, please try again");
            }
            else{
                Found1 = true;
            }
                    
        }
        System.out.println("Enter Password");
        //looping to confirm password
        while (!Found2){
            PasswordInput = Input.nextLine();
            if (!PasswordInput.equals(StoredPassword)){
            System.out.println("Password incorrect, please try again");    
            }
            else{
                Found2 = true;    
            }
        }   
    return true;
}    
    
    public static boolean  checkUserName(String Username){
            //variable declaractions
         
            boolean Found = false;
            //creating scanner
            Scanner Input = new Scanner (System.in);
            System.out.println("Enter a username no more than 5 characters long and containing an underscore.");
            //looping until valid input received
                while (!Found){
                    Username = Input.nextLine();
                    //checking for requirements
                    if (Username.length() < 6 && Username.contains("_")){
                        Found = true;
                        User.setUsername(Username);
                            
                    }
                    else{
                        System.out.println(" Username is not correctly formatted. \nplease ensure that your username:\n-contains an underscore \n-is no longer than 5 characters in length.");
                    }
                 }
        return true;
            
        }
    //checking password
    public static boolean checkPasswordComplexity(String Password){
        //variable declarations
        
        boolean Found = false;
        Scanner Input = new Scanner (System.in);
        System.out.println("Enter a Password, please note the following: \n -Must be at least 8 characters long \n -Contains capital letter \n -Contains a number \n -Containd a special character");
        //looping to verify password
        while (!Found){
        Password = Input.nextLine();
        boolean SpecialChar = Password.matches(".*[^a-zA-Z0-9 ].*");
        boolean CapitalChar = Password.matches(".*[A-Z].*");
        boolean NumberChar = Password.matches(".*[0-9].*"); 
            //checking password
            if ((Password.length() >= 8) && (SpecialChar == true) && (CapitalChar == true) && (NumberChar == true)){
                System.out.println("Password successfully captured");
                 Found = true;
                 User.setPassword(Password);
                }
            else{
                System.out.println("Password format incorrect, please ensure that it has the following:\n  -at least 8 characters long \n  -Contains capital letter \n  -Contains a number \n  -Contain a special character");
            }
                
            }
        return true;
        }
    public static boolean UserInfo(){
        //variables
        String Name, Surname;
        //creating scanners
        Scanner First = new Scanner (System.in);
        Scanner Last = new Scanner (System.in);
        //getting user info
            System.out.println("Enter your Name");
                Name = First.nextLine();
            System.out.println("Enter your Surname");
                Surname = Last.nextLine();
        User.setFirstName(Name);
        User.setLastName(Surname);
        
        return true;
    }
    public static String ReturnLoginStatus(){
    //CHECKING IF LOGIN SUCCEEDED
    if (loginUser()){
        return "Welcome Back, " + User.getFirstName() + " " + User.getLastName() + ". Lets get to work!";    
    }
    else {
        return "Login failed";    
    }   
    }
}
