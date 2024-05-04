
package matteo_nusca_st10440432_prog5121_poe;

//author: Matteo Nusca ST10440432

import java.util.Scanner;

public class Matteo_Nusca_ST10440432_Prog5121_POE {

    
    public static void main(String[] args) {
    
        start();
    }
    
         
        
        
    public static void start(){
    int UserInput1 , UserInput2 ; 
    Scanner choice = new Scanner (System.in);
    System.out.println("Welcome to Kanban, Type '1' to register.");
    UserInput1 = choice.nextInt(); 
    Login1 Login = new Login1();
    if (UserInput1 == 1){
        Login1.registerUser();
        System.out.println("Would you like to login? Type 1 for yes and 2 for no");
        UserInput2 = choice.nextInt();
        if (UserInput2 == 1){
            System.out.println(Login1.ReturnLoginStatus());
        }
    }       
}
    
}
