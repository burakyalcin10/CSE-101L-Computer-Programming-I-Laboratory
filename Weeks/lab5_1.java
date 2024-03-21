
public class lab5_1 {
    public static void main(String[]args){
       /*  int n=1;
        System.out.println("n\tn^2\tn^3");
        while (n<= 900){
            int n2 = n*n;
            int n3 = n*n*n;
            System.out.println(n +"\t" + n2 + "\t" + n3);
            n++;
        } */
        int n = 0;
        double pi = 0.0;
        
        while (n<1000000) {
            pi += 4.0 * (Math.pow(-1, n) / (2*n + 1));
            n++;
        }
        System.out.println("PI is: " + pi);
    
    
    }
}
