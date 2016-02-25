import java.util.Scanner;
/**
 * Write a description of class Cube here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cube
{
    public static void main(String[] args)
    {
       double number1 = 0;
       Scanner scanner = new Scanner(System.in);
     
       for(;;)
       { 
           try
           {
              System.out.print("Please type number to Square: ");
              number1 = Double.parseDouble(scanner.nextLine());   
              System.out.println(cube(number1));
           }
           catch (NumberFormatException nfe)
           {
              System.out.println("Not a number.");
           }
       }
    }
    public static double cube(double number1)
    {
        return number1*number1;
    }
}
