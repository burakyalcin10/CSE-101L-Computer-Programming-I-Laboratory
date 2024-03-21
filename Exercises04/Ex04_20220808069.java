import java.util.Scanner;

public class Ex04_20220808069 {
    public static void main(String[]args){
        //1.question
        Scanner burak = new Scanner(System.in);
        System.out.print("Please enter coordinates' center of cirle: ");
        int x = burak.nextInt();
        int y = burak.nextInt();
        System.out.println("");
        System.out.print("Please enter coordinates' of a point on the circle" +
         " that you want: ");
        int x2 = burak.nextInt();
        int y2 = burak.nextInt();
        double r = Math.sqrt(Math.pow(x-x2, 2)+Math.pow(y-y2, 2));
        double area = Math.PI * Math.pow(r, 2);
        double circumference = 2 * Math.PI * r ;
        System.out.println("Area of the circle: " + area );
        System.out.println("Circumference of the circle: " + circumference);
        System.out.println("");
        //2.question
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your full name : ");
        String fullName = scanner.nextLine();
        int space  =fullName.indexOf(' ');
        String name = fullName.substring(0,space);
        String surname = fullName.substring(space+1);
        System.out.println(surname+" " +name);
        System.out.println("");
        //3.question
        System.out.print("Please enter day number (1-7): ");
        int dayNumber = burak.nextInt();

        String dayName = "";

        switch (dayNumber) {
            case 1:
                dayName = "Monday"; System.out.println("Day name: " + dayName);
                break;
            case 2:
                dayName = "Tuesday"; System.out.println("Day name: " + 
                dayName);
                break;
            case 3:
                dayName = "Wednesday"; System.out.println("Day name: " + 
                dayName);
                break;
            case 4:
                dayName = "Thursday"; System.out.println("Day name: " + 
                dayName);
                break;
            case 5:
                dayName = "Friday"; System.out.println("Day name: " + dayName);
                break;
            case 6:
                dayName = "Saturday"; System.out.println("Day name: " + 
                dayName);
                break;
            case 7:
                dayName = "Sunday"; System.out.println("Day name: " + dayName);
                break;
            default:
                System.out.println("Invalid entry.");
        
        }
        System.out.println("");
        //4.question
        burak.nextLine();
        System.out.print("Please enter city1: ");
        String city1 = burak.nextLine();  
        System.out.print("Please enter city2: ");  
        String city2 = burak.nextLine(); 
        System.out.print("Please enter city3: ");
        String city3 = burak.nextLine();
        if (city1.compareTo(city2)>0){
            String gecici1 = city1;
            city1 = city2;
            city2 = gecici1;
        }
        if (city2.compareTo(city3)>0){
            String gecici2 = city2;
            city2 = city3;
            city3 = gecici2;
        }
        if (city1.compareTo(city2)>0){
            String gecici3 = city1 ;
            city1 = city2 ;
            city2 = gecici3;
        }
        System.out.println("The alphabetic order 3 cities: ");
        System.out.println(city1 + "\n" + city2 + "\n" + city3 );
        System.out.println("");
        //5.question
        System.out.print("Please enter the height of triangle: ");
        double height = burak.nextInt();
        System.out.print("Please enter the base of triangle: ");
        double base = burak.nextInt();

        double areaOfTriangle = (height * base) / 2.0 ;
        System.out.printf("The area of the triangle is: %.3f%n" , +
        areaOfTriangle);

    }
}
