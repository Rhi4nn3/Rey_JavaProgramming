public class FinalActivity3 {
    public static void main(String[] args) {
        
         int[] numbers= {
            12, 7, 25, 40, 
            18, 33, 50, 61
        };

            int even = 0;
            int odd = numbers[0];

            System.out.println("even numbers: ");
            for(int i=0; i<numbers.length; i++){
                if (numbers[i] %  2 == 0)
                System.out.println(numbers[i]);
            };

            System.out.println("odd numbers: ");
            for(int i=0; i<numbers.length; i++){
                if(numbers[i] %  2 == 1)
                System.out.println(numbers[i]);}
        }
    }

