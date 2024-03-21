import java.util.Scanner;
public class lab7 {
    public static void randomA(){
        int a = (int) (Math.random() * 11);
        System.out.println(a);
    }
    public static int random(int min, int max){
        int x = (int) (min + Math.random() * (max-min));
        return x ;
    }
    public static char random(char start, char end){
        return (char)random((int)start,(int)end);

    }
    
    public static String random(int length){
        String x = "";
        for (int i = 0; i < length ; i++){
            x += random('A', 'Z');
        }
        return x;

    }
    public static int reverse(int number){
        int reversednumber = 0;
        while (number!=0){
            int digit = number % 10;
            reversednumber = reversednumber * 10 + digit;
            number /= 10;
        } return reversednumber;
        

    }




    public static void main(String[]args){
        Scanner burak = new Scanner(System.in);
        //random();
        //System.out.println(random(5, 100));
        //System.out.println(random('A','Z'));
       // System.out.println(random(5));
       int original = burak.nextInt();
       
       int reversednumber = reverse(original);
       System.out.println(reversednumber);

    }
}
