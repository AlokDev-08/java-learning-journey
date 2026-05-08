import java.util.Scanner;

public class Geometry {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double radius ;
        double area;
        double circumference;
        double volume;

       System.out.print("Enter the radius : ");
       radius = sc.nextDouble();

       circumference = 2 *Math.PI*radius;
       System.out.printf("The circumference is : %.1fcm\n" ,circumference );

       area = Math.PI*Math.pow(radius,2);
       System.out.printf("The area is : %.1fcm²\n",area);

       volume = (4.0/3.0) *Math.PI*Math.pow(radius,3);
       System.out.printf("The volume is : %.1fcm³\n",volume);

    }
}
