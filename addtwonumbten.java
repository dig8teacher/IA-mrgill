import java.util.Scanner;

public class addtwonumbten {

       public static void main(String[] args) {

       int num1, num2, sum;
       System.out.println("please enter two numbers that total to 10");
       Scanner sc = new Scanner(System.in);
       System.out.println("enter 1st num");
       num1 = sc.nextInt();

       System.out.println("enter 2nd num");
       num2 = sc.nextInt();
       
       int num1 = 5;
       int num2 = 5;

       sum = num1 + num2;

       if (sum == 10) {
               System.out.println("it totals 10");
       } else {
               System.out.println("it does not total 10");
       }
}  
}
