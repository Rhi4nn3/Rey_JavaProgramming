
import java.util.Scanner;

public class FinalExercise2 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        // Enter Score
        int[] scores = new int[10];
        int input = 0;
        for (int i = 0; i < scores.length; i++){
            input++;
            System.out.print("Enter Quiz " + input + " Score: " );
            scores[i] = scan.nextInt();
        }

        // Display
        System.out.println();
        System.out.println("Quiz Scores:");
        int output = 0;
        for (int i = 0; i < scores.length; i++){
            output++;
            System.out.println("Quiz " + output + ": " + scores[i]);
        }

        // Total Score
        System.out.println();
        int total = 0;
        for (int i = 0; i < scores.length; i++){
            total += scores[i];
        }
        System.out.println("Total Score: " + total);

        // Average Score
        double average = (double) total / scores.length;
        System.out.println("Average Score: " + average);
        // int[] mumbers = new int[5];
        // Scanner scn = new Scanner(System.in);

        // for (int i =0; i<mumbers.length; i++)
        //     System.out.println("NUMBER FOR INDEX");
    }
}









































// public class FinalExercise2 
//     public static void main(String[] args) {

//         // for(int i = 5; i>=1; i--){
//         //     for(int j = 1; j<i; j++){
//         //         System.out.print("*");
//         //     }
//         //     System.out.print("\n");
//         // }


//         for(int i=0; i<100; i++){

//             if(i % 3 == 0 && i % 5 != 0){
//                 System.out.println("FIZZ");
//             }
            
//             else if(i % 5 == 0 && i % 3 != 0){
//                 System.out.println("BUZZ");
//             }
            
//             else if(i % 3 == 0 && i % 5 == 0){
//                 System.out.println("FIZZBUZZ");
//             }

//             else{
//                 System.out.println(i);
//             }
//         }
//     }
// }
