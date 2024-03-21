import java.util.Scanner;
public class giris1 {
    public static void main(String[]args){
        Scanner burak = new Scanner(System.in);
        
        System.out.print("Please Enter your weight(kg): ");
        int weight = burak.nextInt();
        
        System.out.print("Please Enter your height(m): ");
        double height = burak.nextDouble();
        double BKI;
        BKI = weight / (height * height);

        System.out.println("Your BKI is : " + BKI);
    }
}

