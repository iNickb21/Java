import java.util.Scanner;
/**
 * Write a description of class Carpet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Carpet
{
    // instance variables - replace the example below with your own
    public static void main(String[] args)
    {
       double w;
       double h;
       double priceSquareFoot;
       double area;
       double price;
       
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("Please type carpet width (feet): ");
       w = scanner.nextDouble();
       
       System.out.println("Please type carpet height (feet): ");
       h = scanner.nextDouble();
       
       area = h*w;
       
       System.out.println("Please type carpet price: ");
       priceSquareFoot = scanner.nextDouble();
       
       price = area*priceSquareFoot;
       
       area = Math.round(area * 100);
       area = area/100;
       
       price = Math.round(price * 100);
       price = price/100;
       
       System.out.println("Carpet Area: " + area + " Square Feet, Price: $" + price);
       
       System.out.println();
       scanner.close();            
    }
}
