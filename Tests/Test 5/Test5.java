public class Test5
{
    public static void main(String[] args)
    {
        int num[] = {5,8,1,3,2,4};
        int num2[] = {20,26,18,52,36,40};
        int temp = 0;
 		for(int a = 0; a<num.length-1; a++)
		{
			for(int b = 0; b<num.length-1; b++)
			{
				if(num[b]>num[b+1])
				{
					temp=num[b];
					num[b]=num[b+1];
					num[b+1]=temp;
				}
			}
		}
		temp = 0;
 		for(int a = 0; a<num2.length-1; a++)
		{
			for(int b = 0; b<num2.length-1; b++)
			{
				if(num2[b]<num2[b+1])
				{
					temp=num2[b];
					num2[b]=num2[b+1];
					num2[b+1]=temp;
				}
			}
		}
    	System.out.println("array 1");
    	for(int i = 0; i < num.length; i++)
    	{
    	    System.out.println(num[i]);
    	}
    	System.out.println("array 2");
    	for(int i = 0; i < num2.length; i++)
    	{
    	    System.out.println(num2[i]);
    	}
    }
}
