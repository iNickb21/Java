import java.util.Scanner;
/**
 * Write a description of class Cube here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Exponent
{
    public static void main(String[] args)
    {
       double number1 = 0;
       int exponent = 0;
       Scanner scanner = new Scanner(System.in);
     
       for(;;)
       { 
           try
           {
              System.out.print("Please type number: ");
              number1 = Double.parseDouble(scanner.nextLine());
              System.out.print("Please type the exponent: ");
              exponent = Integer.parseInt(scanner.nextLine());
              System.out.println(exponentfunc(number1, exponent));
           }
           catch (NumberFormatException nfe)
           {
              System.out.println("Not a number.");
           }
       }
    }
    public static double exponentfunc(double number1, int exponent)
    {
        double answer = number1;
        for(int i = exponent-1;  i > 0;i--)
        {
         
         answer = number1 * answer;
        }
        return answer;
    }
}
