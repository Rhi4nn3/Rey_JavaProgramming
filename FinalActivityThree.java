public class FinalActivityThree {
    public static void main(String[] args) {
        int[] grades =
        { 85, 78, 92, 88, 76, 95, 89, 84, 91, 73};
        
        int highest = grades[0];
        int lowest = grades[0];

        int total = 0;
        for(int i = 0; i<10; i++){
            total += grades[i];
        }
        
        double average = (double) total / grades.length; 

        for(int i=0; i<grades.length; i++)
        if(grades[i] > highest) {
                highest = grades[i];
            }

        for(int i=0; i<grades.length; i++)
        if(grades[i] < lowest) {
            lowest = grades[i];
        }

        int passing = 0;
        int failing = 0;
        for(int i=0; i<grades.length; i++){
            if(grades[i] >= 75){
                passing++;
            }

            else{
                failing++;
            }
        }

        System.out.println("=========Grade Analyzer=========");
        System.out.println("total: " + total);
        System.out.println("Highest grade: " + highest);
        System.out.println("lowest grade: " + lowest);
        System.out.println("average: " + average);
        System.out.println("passing: " + passing);
        System.out.println("failing: " + failing);

    }
}
         
