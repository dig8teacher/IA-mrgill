import java.util.*;

public class DriverInsurance
{
       public static void main(String[] args) throws Exception
{
       char sex, ms;
       int age;
       String str;

       Scanner br = new Scanner(System.in);
       System.out.println("Enter age, sex(M/F), martial status(M for married, U for unmarried");

       age = br.nextInt();
       str = br.nextLine();
       sex = br.next().charAt(0);
       str = br.nextLine();
       ms = br.next().charAt(0);

       if(( ms=='M') || ( ms=='U' && sex=='M' && age>30)
               || ( ms=='U' && sex=='F' && age>25))
               System.out.println("Driver is insured");
       else
               System.out.println("Driver is not insured");
       }
}       
