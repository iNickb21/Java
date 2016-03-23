import java.util.Scanner;
public class Exercise1
{
    public static void main(String[] args)
    {
        String[] vowels = {"a","e","i","o","u"};
        System.out.print("Enter a character: ");
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        boolean is = false;
        
        for(int i=0; i < vowels.length; ++i)
        {
            if(vowels[i].equalsIgnoreCase(input))
                is = true;
        }
        
        if(is == true) 
            System.out.println(input + " is a vowel.");
        else 
            System.out.println(input + " is not a vowel."); 
    }
}
