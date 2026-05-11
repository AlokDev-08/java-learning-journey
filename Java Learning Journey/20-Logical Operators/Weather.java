import java.util.Scanner;
public class Weather {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
//        && = AND
//        || = OR
//        ! = NOT

        int temp = 20;
        boolean isSunny = true;


        if(temp <=30 && temp>=0 && isSunny){
            System.out.println("The Weather is Good.");
            System.out.println("It's Sunny Outside!");
        }
        else if(temp <=30 && temp>=0 && !isSunny){
            System.out.println("The Weather is Good.");
            System.out.println("It's not Sunny Outside!");
        }
        else if(temp>30 || temp<0){
            System.out.println("The Weather is Bad!");
        }
    }
}
