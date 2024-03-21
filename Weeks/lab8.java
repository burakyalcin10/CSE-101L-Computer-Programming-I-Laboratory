import java.util.List;

public class lab8{
    
    public static void display2D(int[][] array){
        for (int i = 0 ; i< array.length ; i++){
            for (int j = 0; j< array.length; j++){
                System.out.printf("%d\t", array[i][j]);
            }
            System.out.println("");
        }
    }

    public static void display2D(char [][]array){
        for (int i = 0 ; i< array.length ; i++){
            for (int j = 0; j< array.length; j++){
                System.out.printf("%c\t", array[i][j]);

        }
        }System.out.println("");
    }

    public static int random(int start, int end){
        return (int)(start+ Math.random()* (end-start+1));
    }

    public static int [][] generatearray2D (int m, int n, int start, int end){
        int [][] list = new int [m][n];
        for(int i=0;i<list.length;i++){
            for(int j=0;j<list.length;j++){
                list[i][j]= random(start, end);
            }
        }return list;
    }

    public static int sumMajorDiagonal(int[][] m){
        int sum = 0;
        for(int i=0; i<m.length;i++){
           sum+=m[i][i];
        }return sum;
    }

    public static int[] employeeworkhours(int[][] employeework){
        int [] workinhours = new int[employeework.length];
        for (int employee = 0; employee<employeework.length; employee++){
            for(int hours = 0; hours < employee[employee].length;hours++){}
        }

    }
    
    
    
    public static void main(String[] args) {
        
        int [][] list = generatearray2D(8, 7, 0, 10);
        display2D(list);
        System.out.println(sumMajorDiagonal(list));
        display2D(list);

    }
}