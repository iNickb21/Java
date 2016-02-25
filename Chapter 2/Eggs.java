import java.util.Scanner;

public class Eggs
{
    public static void main(String[] args)
    {
       int numberOfEggs = 0;
       Scanner scanner = new Scanner(System.in);
     
       for(;;)
       { 
           try
           {
              System.out.print("Please type number of Eggs: ");
              numberOfEggs = Integer.parseInt(scanner.nextLine());   
              System.out.println(numberOfEggs + " Eggs is equal to " + getDozen(numberOfEggs) + " dozen with " + getRemainder(numberOfEggs) + " left over.");
           }
           catch (NumberFormatException nfe)
           {
              System.out.println("Not a number.");
           }
       }
    }

    public static int getDozen(int y)
    {
        int dozen;
        dozen = y / 12;
        return dozen;
    }
    public static int getRemainder(int y)
    {
        int remainder;
        
        remainder = y % 12;
        return remainder;
    }
}
