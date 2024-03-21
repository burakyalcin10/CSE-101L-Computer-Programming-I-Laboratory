import java.util.Scanner;
public class Ex05_20220808069 {
    //@author Burak Yalçın
    //20220808069
    public static void main(String [] args) {
    }
    static double computePI(int i) {
        if (i == 0) {
            return 3;
        }
        double pi = 4*(1-(Math.pow(-1, i +1))/(2*i - 1));
        return pi;
    }
    static int factorial(int integer) {
        int i = 1;
        int factorial = 1;
        while (i <= integer) {
            factorial *= i;
            i++;
        }
        return factorial;
    }
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
            for(int i = 2; i<=Math.sqrt(n);i++){
                if(n % i ==0){
                    return false;
                }
                
            }
            return true;
    }
    public static void nPrime(int n){
        int value = 2;
        int count = 0;
        while (count < n){
            if(isPrime(value)){
                System.out.print(value + " ");
                count++;
            }
            value++;

        }
            
    }
    public static void nPerfectNumbers(int n) {
        int count = 0;
        int number = 2;
    
        while (count < n) {
            int divider = 0;
    
            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0) {
                    divider += i;
                }
            }
    
            if (divider == number) {
                count++;
                System.out.print(number + " ");
            }
            number++;
    }
}
    public static void displayStatistics(int n){
        Scanner burak = new Scanner(System.in);
        double values=0; 
        double result = 0;
        double temp = n;
        double result2 = 0; 
        do{
         values = burak.nextDouble();
         temp--;
         result += values;
         
         result2 += Math.pow(values, 2);
         
         }while(temp>0);
         double mean = result/n;
         System.out.println(mean);
         
         double deviation2 = ( result2 -(Math.pow(result, 2))/n);
         double dc= Math.sqrt(deviation2/(n-1));
         System.out.println(dc);
 
 
}
 
}
