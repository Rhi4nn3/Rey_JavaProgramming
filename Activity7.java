import java.util.Scanner;

public class Activity7 {
    public static void main(String[] args) {
       
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Email :");
        String email = scn.nextLine();
        scn.close();

        int atPoint = email.indexOf("@");

        String username = email;
        System.out.println(username.substring(0,atPoint));
    
        
        System.out.println(useranme);
        System.out.println(domain);

        
    }
}
