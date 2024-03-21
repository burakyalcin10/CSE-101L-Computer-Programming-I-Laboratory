import java.util.*;

public class lab4 {
    public static void main(String[]args){
        Scanner burak = new Scanner(System.in);
        System.out.print("Please enter Point 1: ");
        double x1 = Math.toRadians(burak.nextDouble());
        double y1 = Math.toRadians(burak.nextDouble());
        System.out.print("Please enter Point 2: ");
        double x2 = Math.toRadians(burak.nextDouble());
        double y2 = Math.toRadians(burak.nextDouble());
        final double RADIUS = 6371.01;
        double distance = RADIUS * Math.acos(Math.sin(x1)*Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1-y2));
        System.out.print("Distance :" + distance);


    }
}
