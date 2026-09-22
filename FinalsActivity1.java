
import java.util.Scanner;

public class FinalsActivity1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("==========CREATE AN ACCOUNT==========");
        System.out.println("Enter Username:");
        String userName = scn.nextLine();

        System.out.println("Enter Password:");
        String password = scn.nextLine();
    
        System.out.println("Please Conform Password");
        String entered = scn.nextLine();
        
        while(!entered.equals(password)){
                System.out.println("Password does not match. Please try again.");
                System.out.println("Please Conform Password: ");
                entered = scn.nextLine();
         }
        System.out.println("==========LOGIN==========");
        

        System.out.println("Enter Username");
        String user = scn.nextLine();
        System.out.println("Enter Password");
        String parole = scn.nextLine();
        
        
            while(!user.equals(userName)){
                System.out.println("Invalid Username. Please try again.");
                System.out.println("Enter Username");
                user = scn.nextLine();
            }
           
            System.out.println("Enter Password");
            parole = scn.nextLine();
               
            while(!parole.equals(password)){
                System.out.println("Invalid Username. Please try again.");
                System.out.println("Enter Password");
                parole = scn.nextLine();
         }

         System.out.println("Welcome User!");
    }

}
