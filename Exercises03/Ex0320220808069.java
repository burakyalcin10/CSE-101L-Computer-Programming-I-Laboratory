import java.util.Scanner;
/*
*-----------------------------------------------------
* Akdeniz University CSE101L Lab Assignments
* Name: Burak Yalçın
* Date: 14.11.2023
* Description: Exercise03
* Score: ?
*-----------------------------------------------------
 */
public class Ex0320220808069 {
    public static void main(String[] args){
        //1.question
        Scanner burak = new Scanner(System.in);
        System.out.println("Our restaurant has these meals and drinks");
        System.out.println("ID    Meal      Price");
        System.out.println("1     Doner     80 lira");
        System.out.println("2     Kebab     110 lira");
        System.out.println("3     Lahmacun  75 lira ");
        System.out.println("");
        System.out.println("ID    Drink     Price");
        System.out.println("1     Ayran     10 lira");
        System.out.println("2     Kola      20 lira");
        System.out.println("3     Salgam    15 lira");
        System.out.println("");
        System.out.print("Please enter meal ID and drink ID which you want: ");
        int mealID = burak.nextInt();
        int drinkID = burak.nextInt();


        int mealcost=0;
        String mealname="";
        int drinkcost = 0;
        String drinkname="";

        if (mealID==1){
            mealcost=80;
            mealname="Doner";
        }
        else if (mealID==2){
            mealcost=110;
            mealname="Kebab";
        }
      
        else if (mealID==3){
            mealcost=75;
            mealname="Lahmacun";
        }
         
        if (drinkID==1){
            drinkcost=10;
            drinkname="Ayran";            
        }
        else if (drinkID==2){
            drinkcost=20;
            drinkname="Kola";
        }
        else if (drinkID==3){
            drinkcost=15;
            drinkname="Salgam";
        }
        else{
            System.out.println("Oopps! You entered wrong number. Please enter number between 1 and 3.");
        }
        int total = mealcost + drinkcost ;
        System.out.println(mealname + " and " +drinkname+ " " + total + " lira. ");
        System.out.println("");
        //2.question
        System.out.print("Please choose type of membership for internet: ");
        int type = burak.nextInt();
       if (type==1){
        System.out.print("Please enter GB how many you want to use: ");
        int type1GB = burak.nextInt();
        if (type1GB<=100){
            System.out.println("The amount you need to pay: "+ 80 );
        }
        else if (type1GB>100){
            System.out.println((type1GB-100)*3 + (type1GB-100)* (15.0/100.0)*3 + 80 + " is the amount you need to pay." );
        }
       }
       else if (type==2){
        System.out.print("Please enter GB how many you want to use: ");
        int type2GB = burak.nextInt();
        if (type2GB<=200){
            System.out.println("The amount you need to pay: " +140 );
        }
        else if (type2GB>200){
            System.out.println((type2GB-200)*5 + (type2GB-200)*(10.0/100.0)*5 + 140 + " is the amount you need to pay.");
        }
       }
       System.out.println("");
       //3.question
        System.out.print("Please enter the attack number(1 or 2): ");
        int attacknumber = burak.nextInt();
        System.out.print("Please enter the toss: ");
        int cointoss1 = burak.nextInt();
        int damage = 0;
        if (cointoss1 == 2){
            cointoss1= (int)(Math.random()*2);
        }
        System.out.print("Please enter the toss: ");
        int cointoss2 = burak.nextInt();
        if (cointoss2 == 2){
            cointoss2 = (int)(Math.random()*2);
        }
        if (attacknumber == 1){
            if (cointoss1 == 1 && cointoss2 == 1){
                damage += 60;
                System.out.println("Damage is " + damage + ".");
            }
            else{
                System.out.println("Damage is 0.");
            }
        }
        if (attacknumber == 2){
            damage += 50;
            if (cointoss1 == 1){
                damage += 20;
            }
            if (cointoss2 == 2){
                damage += 20;
            }
            System.out.println("Damage is " + damage + ".");
        }


    }} 

    
