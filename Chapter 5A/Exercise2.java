import java.util.Scanner;

public class Exercise2
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("What size pizza do you want? S, M, L, X");
        String input = scan.nextLine();
        String pizzaPrice = "";
        
        if(input.equalsIgnoreCase("S"))
            pizzaPrice = "$6.99";
        
        else if(input.equalsIgnoreCase("M"))
            pizzaPrice = "$8.99";
        
        else if(input.equalsIgnoreCase("L"))
            pizzaPrice = "$12.50";

        else if(input.equalsIgnoreCase("X"))
            pizzaPrice = "$15.00";
        
        else
        {
            System.out.println("That's not an option! Pizza sizes are S, M, L, or X.");
            System.exit(0);
        }

        System.out.println("Your pizza costs " + pizzaPrice + ".");

    }
}
