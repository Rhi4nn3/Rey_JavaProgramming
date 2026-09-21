package Activities;
import java.util.Scanner;

public class Activity9 {
public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    System.out.println("PLEASE ENTER YOUR PIN NUMBER: ");
    int pin = scn.nextInt();

    switch (pin) {
        case 1234:
            System.out.println("LOGIN SUCCESSFUL! WELCOME TO YOUR ACCOUNT.");
            System.out.println("ATM Menu: ");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposite Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit Account");
            System.out.println("Choose an option: 1 ");
            System.out.println("Your current balance is: 5000.00");
            break;
        default:
            System.out.println("Invalid PIN. Please try again.");
            break;
    }
}    
}
