import java.util.Scanner;

public class SignUp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please, Enter your age : ");
        int age  = sc.nextInt();
        if(ageCheck(age)){
            System.out.println("You can Sign Up!");
        }
        else{
            System.out.println("You must be 18+ to Sign Up!");
        }
    }
    static Boolean ageCheck(int age){
        if(age>=18){
            return true;
        }
        else{
            return false;
        }
    }
}
