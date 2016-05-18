import java.util.Scanner;
/** 
 * @author Harold
 * @version 5-17-2016
 */
public class RunSeniors
{
    static Seniors[] senior = new Seniors[4];
    
    public static void main(String[] args)
    {
       Scanner scanner = new Scanner(System.in);
       double gpaTemp = 0;
       String nameTemp = "";
       for(int i=0;i<4;i++)
       { 
           System.out.print("Please type senior " + (i+1) + "'s name:");
           nameTemp = scanner.nextLine();
           try
           {
              System.out.print("Please type the " + (i+1) + " senior's GPA:");
              gpaTemp = Double.parseDouble(scanner.nextLine());   
           }
           catch (NumberFormatException nfe)
           {
              System.out.println("Not a number.");
           }
           
           senior[i]= new Seniors(nameTemp, gpaTemp);   
       }

       printGpa(sort(senior));
    }
    
    public static Seniors[] sort(Seniors[] s)
    {
       Seniors temp;
       int n = 4;
       for(int i=0; i < n; i++)
       {
          for(int j=1; j < (n-i); j++)
          {
              if(s[j-1].getGpa() > s[j].getGpa())
              {
                  temp = s[j-1];
                  s[j-1] = s[j];
                  s[j] = temp;
              }
          }
       }
       return s;
    }
    
    public static void printGpa(Seniors[] s)
    {
       for(int i=0;i<4;i++)
       {
           System.out.println(s[i].getName() + " has a gpa of " + s[i].getGpa() + ".");
       }
    }
}
