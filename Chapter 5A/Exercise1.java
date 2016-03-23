public class Exercise1
{
    public static void main(String[] args)
    {
        int[] array = {1,2,3,4,5};
        System.out.println("Least to greatest:");
        for(int i=0; i<5; i++)
        {
            System.out.println(array[i]);
        }
        System.out.println("Greatest to least:");
        for(int i=4; i>=0; i--)
        {
            System.out.println(array[i]);
        }
    }
}
