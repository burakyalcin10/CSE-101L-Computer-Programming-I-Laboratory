import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class lab9 {
    public static void main(String[] args) {
    /*     String texString = "lorem.txt";  

        try (BufferedReader br = new BufferedReader(new FileReader(texString))) {
            int karakterSayisi = 0;
            int kelimeSayisi = 0;
            int satirSayisi = 0;

            String satir;
            while ((satir = br.readLine()) != null) {
                karakterSayisi += satir.length();
                kelimeSayisi += satir.split("\\s+").length;
                satirSayisi++;
            }

            System.out.println("Karakter sayısı: " + karakterSayisi);
            System.out.println("Kelime sayısı: " + kelimeSayisi);
            System.out.println("Satır sayısı: " + satirSayisi);

        } catch (IOException e) {
            System.err.println("Dosya okuma hatası: " + e.getMessage());
        } */
        
        File textfile = new File("lorem.txt");
        int numChars = 0;
        int numLines = 0;
        int numWords = 0;
        try{
            Scanner file = new Scanner(textfile);
            while(file.hasNext()){
                String nextword = file.next();
                numWords ++;
                numChars += nextword.length();

            }
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        System.out.println(numChars);
        System.out.println(numWords);
        
   
   
   
   
   
    }
}