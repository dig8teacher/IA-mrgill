import java.util.Scanner;

public class addtwonumbtenplus {

       public static void main(String[] args) {

       int num1, num2, sum;
       System.out.println("please enter two numbers that total to 10 or one of them is 10");
       Scanner sc = new Scanner(System.in);
       System.out.println("enter 1st num");
       num1 = sc.nextInt();

       System.out.println("enter 2nd num");
       num2 = sc.nextInt();

       sum = num1 + num2;

       if (num1 == 10|| num2 == 10 || sum == 10) {
               System.out.println("it totals 10");
       } else {
               System.out.println("it does not total 10");
       }
}  
}
