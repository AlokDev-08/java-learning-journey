import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {

//        .substring() = A method used to extract a portion of a string.substring( start, end )

        Scanner sc = new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.print("Enter your email : ");
        email = sc.nextLine();

        if(email.contains("@")){
            username = email.substring(0,email.indexOf("@"));
            domain = email.substring(email.indexOf("@")+1);

            System.out.println("The username is : "+username);
            System.out.println("The domain is : "+domain);
        }
        else {
            System.out.println("The email must contain '@'");
        }

        sc.close();

    }
}
