import java.util.Scanner;

/** 
 * @author Nick 
 * @version 5-2-2016
 */
public class SortSalon
{
    
    static String names[] = {"Cut", "Shampoo", "Manicure", "Blowdry", "Color", "Special Massage ;)"};
    static double prices[] = {12.50,10,15.25,5.50,30,50};
    static int time[] = {15,6,25,4,40,30};
    static HairSalon[] service = new HairSalon[6];
    
    public static void main(String[] args)
    {
       int number1 = 0;
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
              number1 = Integer.parseInt(scanner.nextLine());   
              //System.out.println("to come soon");
              sort(number1,service);
           }
           catch (NumberFormatException nfe)
           {
              System.out.println("Not a number.");
           }
       }
    }
    
    public static void sort(int type, HairSalon[] h)
    {

        if(type == 1)
        {
             HairSalon temp;
             int n = 6;
             for(int i=0; i < n; i++)
             {
                for(int j=1; j < (n-i); j++)
                {
                    if(h[j-1].getServiceName().compareToIgnoreCase(h[j].getServiceName()) > 0)
                    {
                        //swap the elements!
                        temp = h[j-1];
                        h[j-1] = h[j];
                        h[j] = temp;
                    }           
                }
             }
        }
        else if(type == 2)
        {
             HairSalon temp;
             int n = 6;
             for(int i=0; i < n; i++)
             {
                for(int j=1; j < (n-i); j++)
                {
                    if(h[j-1].getServicePrice() > h[j].getServicePrice())
                    {
                        //swap the elements!
                        temp = h[j-1];
                        h[j-1] = h[j];
                        h[j] = temp;
                    }           
                }
             }
        }
        else if(type == 3)
        {
             HairSalon temp;
             int n = 6;
             for(int i=0; i < n; i++)
             {
                for(int j=1; j < (n-i); j++)
                {
                    if(h[j-1].getServiceMinutes() > h[j].getServiceMinutes())
                    {
                        //swap the elements!
                        temp = h[j-1];
                        h[j-1] = h[j];
                        h[j] = temp;
                    }           
                }
             }
        }
        else
        {
            System.out.println("Not a valid option");
        }
        
        for(int i=0;i<6;i++)
        {
            System.out.println((i+1) + ". Service Name: " + h[i].getServiceName() + " Service Price: " + h[i].getServicePrice() + " Estimated Time: " + h[i].getServiceMinutes());
        }
    }
}
