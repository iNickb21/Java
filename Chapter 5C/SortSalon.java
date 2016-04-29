import java.util.Scanner;

/**
 * Write a description of class Hairsalon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SortSalon
{
    
    static String names[] = {"Cut", "Shampoo", "Manicure", "Blowdry", "Color", "Special Massage ;)"};
    static double prices[] = {12.50,10,15.25,5.50,30,50};
    static int time[] = {15,6,25,4,40,30};
    static HairSalon[] service = new HairSalon[6];
    
    public static void main(String[] args)
    {
       double number1 = 0;
       Scanner scanner = new Scanner(System.in);
       
        
       for(int i=0;i<service.length;i++)
       {
           service[i]= new HairSalon(names[i], prices[i], time[i]);
       }
       for(;;)
       { 
           try
           {
              System.out.println("How would you like our services sorted?");
              System.out.println("Press 1 for description.");
              System.out.println("Press 2 for price");
              System.out.println("Press 3 for time.");
              number1 = Double.parseDouble(scanner.nextLine());   
              //System.out.println("to come soon");
           }
           catch (NumberFormatException nfe)
           {
              System.out.println("Not a number.");
           }
       }
    }
    
    public static void sort(int type, HairSalon[] h)
    {
        for(int i=0;i<6;i++)
            System.out.println((i+1) + "Service Name: " + h[i].getServiceName() + " Service Price: " + h[i].getServicePrice() + " Estimated Time: " + h[i].getServiceMinutes());
        
    }
}
