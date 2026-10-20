import java.util.Scanner;

public class FinalActivity4 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int[] numbers = new int[10];
        int scores = 0;

        for (int i =0; i< numbers.length; i++){
            scores++;
            System.out.print("Enter Quiz " + scores + " score: ");
            numbers[i] = scn.nextInt();
        }

        System.out.println("");
        System.out.println("Quiz Scores:");
        int display = 0;
        for (int i =0; i<numbers.length; i++){
            display++;
            System.out.println("Quiz" + display + " : " + numbers[i]);
        }

        int total = 0;
        for(int i = 0; i<numbers.length; i++){
            total += numbers[i];
        }

        double average = (double) total / numbers.length; 

        System.out.println("Total score: " + total);
        System.out.println("Average score: " + average);
    }
    
}
