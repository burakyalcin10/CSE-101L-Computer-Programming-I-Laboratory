public class lab10 {
    
    public static double fonksiyon(int i){
        if (i==1){
            return (1.0/2);
        }
        else if(i == 0){
            return 0.0; 
        }
        else {
            return ((double)i/(i+1)) + fonksiyon(i-1);
        }
    }

    public static void reverseDisplay(int value){
        if(value == 0)
        System.out.println("");
        else{
            System.out.print(value % 10);
            reverseDisplay(value/10);
        }
    }
    
    public static int findLargest(int[] dizi, int start, int end){
        int max = 0;
        int mid = 0;
        if (start == end){
            return dizi[start];
        }
        else {
            mid = (start + end)/2;
            int leftMax = findLargest(dizi, start, mid);
            int rightMax = findLargest(dizi, mid+1, end-1);
            

        return Math.max(leftMax, rightMax);
    }
        
    }
    public static void main(String[] args) {
        int [] burak = {1,2,3,4,5,6,8};
       System.out.println(findLargest(burak, 0, 5));

    }
}
