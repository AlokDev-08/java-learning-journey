public class Discount {
    public static void main(String[] args) {

        boolean isStudent = true;
        boolean isSenior = true;
        double price = 9.99;

        if(isStudent){
            if(isSenior){
                System.out.println("You get a Senior Discount of 20%");
                System.out.println("You get a Student Discount of 10%");
                price = price*0.7;
            }
            else {
                System.out.println("You get a Student Discount of 10%");
                price = price *0.9;
            }
            }
        else{
            if(isSenior){
                System.out.println("You get a Senior Discount of 20%");
                price = price *0.8;
        }
        }
        System.out.printf("The price of the ticket is : %.2f",price);
    }
}
