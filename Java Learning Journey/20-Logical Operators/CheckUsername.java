import java.util.Scanner;

public class CheckUsername {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Username must be between 4-12 characters
//        Username must not contain spaces or underscore

        String userName;

        System.out.print("Enter the username : ");
        userName = sc.nextLine();

        if(userName.length()<4 || userName.length()>12){
            System.out.println("The username must be between 4-12 characters.");
        }
        else if(userName.contains(" ")|| userName.contains("_")){
            System.out.println("The username must not contain spaces or underscores.");
        }
        else {
            System.out.println("Welcome !"+userName);
        }
    }
}