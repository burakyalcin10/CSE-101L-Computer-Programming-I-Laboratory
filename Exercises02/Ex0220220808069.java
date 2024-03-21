import java.util.Scanner ;
/*
*-----------------------------------------------------
* Akdeniz University CSE101L Lab Assignments
* Name: Burak Yalçın
* Date: 14.11.2023
* Description: Exercise02
* Score: 100
*-----------------------------------------------------
 */
public class Ex0220220808069 {
    public static void main(String[]args){ 
        Scanner burak = new Scanner(System.in);
       //1.question
        System.out.print("Enter integer: ");
        
        int x = burak.nextInt();
        if (x<=0 && x>-10 || x>=0 && x<10){
            System.out.println("Result is 0");
        }
        else{
           
            int z = x / 10 ;
            int c = z % 10 ;
            if (c<0){
            System.out.println("Result is " + -c);
            }
            else {
                System.out.println("Result is " + c);

        }} 
        //2.question
        System.out.print("Please enter used minute: ");
        int minute = burak.nextInt();
        int a = minute / 60 ;
        int b = minute % 60;
        if (minute<0){
            System.out.println("ERROR: Minute can not be negative.");
        }
        else {
        if (b>0) {
            System.out.println("Your payment is : " + ((a*50)+50));
        }else {
            System.out.println("Your payment is : " + a*50);
        }}


            System.out.print("Please enter your trial number: ");
            int k = burak.nextInt();
            double p = 1.0 / 6 ;
            
            double probability = Math.pow((1-p) , k-1)* p;
            if (k <0){
                System.out.println("ERROR: Your trial number can not be " +
                "negative");
            }
            else {
            System.out.println("The probability of rolling the first 4 " +
            "on trial " +k + " is " + probability);
            }






        }
        



    }
    

