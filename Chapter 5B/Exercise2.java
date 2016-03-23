public class Exercise2
{
    public static void main(String[] args)
    {
        String randomCharacters = "1dm395o1md01**(md2oa2DM249dm3r8ake9alef8";
        char[] randomCharactersArray = randomCharacters.toCharArray();
        
        int numChar = 0;
        
        for(int i=0;i<randomCharactersArray.length;i++)
        {
            if(Character.isLetter(randomCharactersArray[i]))
            numChar++;
        }
        System.out.println("There are " + numChar + " characters and " + (randomCharactersArray.length - numChar) + " not characters.");
    }
}
