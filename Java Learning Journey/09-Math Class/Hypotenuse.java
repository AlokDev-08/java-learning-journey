import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of side A : ");
        double A = sc.nextDouble();
        System.out.print("Enter the length of side B : ");
        double B = sc.nextDouble();

        double C = Math.sqrt(Math.pow(A,2)+Math.pow(B,2));

        System.out.println("The hypotenuse (side C) id : "+C+"cm");

        sc.close();
    }
}
