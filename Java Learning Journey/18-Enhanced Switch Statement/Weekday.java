import java.util.Scanner;
public class Weekday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Enhanced Switch = A replacement to many if else statements
//                                    (Java14 Feature)

        System.out.print("Enter the day of week : ");
        String day = sc.nextLine().trim().toLowerCase();

        switch(day){
            case  "monday","tuesday","wednesday","thursday","friday"
                -> System.out.println("This is a Weekday.");
            case "saturday","sunday"-> System.out.println("This is a Weekend.");
            default -> System.out.println(day+" is not a day.");
        }
        sc.close();
    }
}
