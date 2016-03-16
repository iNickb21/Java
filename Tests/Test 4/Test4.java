import java.util.Scanner;
/**
 * Chapter 4 test performance section.
 * 
 * @author iNickb21
 * @version 3/16/2016       
 */
public class Test4
{
    private int x;
    
    public static void main(String[] args)
    {
        String input = "";
        int loopX = 0;
        int loopY = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello. What is your status?");
        input = scanner.next();
        
        switch(input)
        {
            case "F":
            case "f":
                loopX = 2;
                break;
            case "S":
            case "s":
                loopX = 4;
                break;
            case "J":
            case "j":
                loopX = 6;
                break;
            case "G":
            case "g":
                loopX = 8;
                break;
            default:
                loopX = 1;
        }
        
        for(int i = 0; i < loopX; i++)
        {
            System.out.println("This is loop " + (i+1) + ".");
            for(int loopy = 0;loopy<3;loopy++)
            {
                System.out.println("I love Java.");
            }
        }
    }

}
