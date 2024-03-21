import java.util.*;
public class lab4_1 {
    public static void main(String[]args){
     /*  Scanner burak = new Scanner(System.in);
      System.out.print("Please enter letter grade: ");
      char lettergrade = burak.next().charAt(0);
      if (lettergrade != 'A' && lettergrade != 'B' && lettergrade != 'C' && lettergrade != 'D' 
      && lettergrade !='a' && lettergrade != 'b' && lettergrade !='c' && lettergrade !='d'){
            System.out.println("Invalid Entry");
      }
      else {
      if(lettergrade == 'a' && lettergrade == 'A'){
        System.out.println("Numeric value for grade A is 4");
      }
      else if (lettergrade == 'b' && lettergrade == 'B'){
        System.out.println("Numeric value for grade B is 3");
      }
      else if (lettergrade == 'c' && lettergrade == 'C'){
        System.out.println("Numeric value for grade C is 2");
      }
      else if (lettergrade == 'd' && lettergrade == 'D'){
        System.out.println("Numeric value for grade D is 1");
      }} */

        Scanner burak = new Scanner(System.in);
      System.out.print("Please enter letter grade: ");
      char lettergrade = burak.next().charAt(0);
      if (Character.isLetter(lettergrade)){
        if(Character.isLowerCase(lettergrade)){
            lettergrade = Character.toUpperCase(lettergrade);
        }
        if ((lettergrade== 'E' || lettergrade> 'F')) {
            System.out.println("Invalid entry");
        }
        else {
            int value;
            if (lettergrade== 'F'){
                value=0;
            }else {
                value ='E' - lettergrade ;
            }
            System.out.println("Grade value for " + lettergrade + " is " + value );
        }
    }
      else {
        System.out.println("Invalid entry");
      }
      

      


    }
}
