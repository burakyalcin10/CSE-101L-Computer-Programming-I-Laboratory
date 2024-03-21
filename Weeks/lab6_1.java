import java.util.Scanner;
public class lab6_1 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int line;
        do {
            System.out.print("Enter number: ");
            line = input.nextInt();
        }while (line>10);
        for (int i = 1; i<= line; i++){
            for (int j = 1; j<= i;j++){
                System.out.print(j + "\t");
            }System.out.println("\n");
        }
        
        for (int i = 1 ;i<= line; i++){
            for (int j = line - 1 ; j>=i; j--){
                System.out.print("\t");
            }
            for (int j = i;j>=1;j--){
                System.out.print(j + "\t");
            }
            System.out.println("\n");
        }
    }   
}
