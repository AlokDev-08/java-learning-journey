import java.util.Scanner;
public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Temperature Converter

        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the temperature : ");
        temp = sc.nextDouble();
        sc.nextLine();
        System.out.println("Convert to Celsius or Fahrenheit : (C or F)");
        unit = sc.nextLine().toUpperCase();

        newTemp = (unit.equals("C"))? (temp -35)*5/9 : (temp*5/9)+32;
        System.out.printf("The new temperature is %.2f",newTemp);

        sc.close();
    }
}
