package Activities;
import java.util.Scanner;

public class Activity8 {
    public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);

     System.out.println("What day of the week is today? (1, 2, 3, 4 , 5 , or 6/7)");
     int num1 = scn.nextInt();

     if(num1 == 1){
        System.out.println("Today is a Monday !!");
     }
     else if (num1 == 2){
        System.out.println("Today is Tuesday !!");
     }

     
     else if (num1 == 3){
        System.out.println("Today is Wednesday !!");
     }

    
     else if (num1 == 4){
        System.out.println("Today is Thursday !!");
     }

    
     else if (num1 == 5){
        System.out.println("Today is Friday !!");
     }

  
     else if (num1 == 6){
        System.out.println("Today is the Weekend (Saturday) !!");
     }

    else if (num1 == 7){
        System.out.println("Today is the Weekend (Sunday) !!");
     }

     else if (num1 >7){
        System.out.println ("There are only seven days of the week.");
     }
    }
}
