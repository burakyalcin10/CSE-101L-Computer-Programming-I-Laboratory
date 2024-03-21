import java.util.*;
import java.util.Scanner ;
public class lesson3 {
    public static void main(String[] args){
        System.out.println("Welcome the BMI calculator.");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a weight in kilograms: ");
        double x = input.nextDouble();
        System.out.print("Please enter a height in m: ");
        double y = input.nextDouble();

        double BMI = x / (y * y);
        if (BMI<18.5){
            System.out.println("Your BMI is " + BMI + " and it is underweight. ");
        }
        else {
        if (BMI>=18.5 && BMI<25.0){
            System.out.println("Your BMI is " + BMI + " and it is normal. ");
        }
        else {
        if (BMI>=25.0 && BMI<30.0){
            System.out.println("Your BMI is " + BMI + " and it is overweight. ");
        }
        else {
            System.out.println("Your BMI is " + BMI + " and it is obese. ");
        



    }}}
    }

}