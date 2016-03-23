import java.util.Scanner;
public class Exercise3
{
    public static void main(String[] args)
    {
        System.out.print("Enter your name: ");
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.println("Hello " + input + "!");
    }
}