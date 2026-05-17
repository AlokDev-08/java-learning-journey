import java.util.Scanner;
public class Calc { 
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

//    Calculator Program

        double num1;
        double num2;
        char op;
        double result =0;
        boolean isValidOperation;

        System.out.print("Enter the first number : ");
        num1 = sc.nextDouble();
        System.out.print("Enter the operator (+,-,*,/,^) : ");
        op = sc.next().charAt(0);
        System.out.print("Enter the second number : ");
        num2 = sc.nextDouble();

        switch(op){
          case '+'-> result = num1+num2;
          case '-'-> result = num1-num2;
          case '*'-> result = num1*num2;
          case '/'-> {
              if (num2 == 0) {
                  System.out.println("Cannot be divided by zero!");
                  isValidOperation=false;
              } else {
                  result = num1 / num2;
              }
          }
          case '^'-> result = Math.pow(num1,num2);
          default ->{
              System.out.println("Invalid Operator!");
              isValidOperation=false;
          }
        }
        System.out.println("Result : "+result);

        sc.close();
    }
}
