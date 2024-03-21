import java.util.*;
public class lab4_2 {
    public static void main(String[]args){
        Scanner burak = new Scanner(System.in);
        System.out.println("Enter s1: ");
        String s1 = burak.nextLine();
        System.out.println("Enter s2: ");
        String s2 = burak.nextLine();

        if (s1.contains(s2)){
            System.out.printf("%s is substring of %s", s2 , s1);
        }
        else {
            System.out.printf("%s is not substring of %s", s2 , s1);
        }
    }
}
