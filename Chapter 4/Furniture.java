import java.util.Scanner;

/**
 * Chapter 4A Ex2 (Furniture)
 * 
 * @author Harold Boyett
 * @version 4-27-2016
 */
public class Furniture
{
    public static void main(String[] args)
    {
        String one = "";
        String two = "";
        String wood = "";
        String printString = "";
        int price = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press P for pine, O for oak or M for Mahogany");
        one = scanner.next();
        if (one.matches("P|O|M|p|o|m"))
        {
            if ((one.equals("P") || one.equals("p")))
            {
                wood = "pine";
                price = 100;
            }
            else if ((one.equals("O") || one.equals("o")))
            {
                wood = "oak";
                price = 100;
            }
            else if ((one.equals("M") || one.equals("m")))
            {
                wood = "mahogany";
                price = 310;
            }
            
        }
        else wood = "THATS NOT AN OPTION STUPID!";
        
        System.out.println("Press S for small or L for large (+$35)");
        two = scanner.next();
        
        if (two.matches("s|S|l|L"))
        {
            if ((two.equals("s") || two.equals("S")))
            {
                System.out.println("No price increase");
            }
            else if ((two.equals("l") || two.equals("L")))
            {
                price = price + 35;
                System.out.println("Price increase +$35");
            }
        }
        else wood = "THATS NOT AN OPTION STUPID!";   
        
        printString = wood + " $" +  price;
        System.out.println(printString);
    }
}