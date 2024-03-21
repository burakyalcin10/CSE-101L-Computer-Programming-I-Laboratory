import java.util.Scanner;
public class lab5 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
         System.out.println("Please enter integers: ");
        int positiveCount = 0 ;
        int negativeCount = 0 ;
        int sum = 0 ;
        int value ;
        int count= 0;
        float average ;

        System.out.print("Enter integers(to exit enter 0): ");

        while (true) {
            value = input.nextInt();
            if (value == 0){
            break;
            } else if (value>0){
                positiveCount++;
            }else {
                negativeCount++;
            }
            sum += value;
        }   //burası benim yazdığım

      /*   int count= 0;
        int positiveCount = 0;
        int negativeCount = 0;
        int sum = 0;
        int number;
        float average ;
        
        do {
            number = input.nextInt();
            sum += number;
            if (number > 0){
                positiveCount++;
            }else if (number < 0){
                negativeCount++;
            }

        }while (number != 0);
        */ 
        count = positiveCount + negativeCount;
        average = (float)sum / count ;
        System.out.println("Number of positive inputs: " +positiveCount);
        System.out.println("Number of negative inputs: " +negativeCount);
        System.out.println("Sum of input values: " + sum );
        System.out.println("Average : " +average);

    
    }
}
   
