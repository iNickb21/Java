public class Exercise4
{
    public static void main(String[] args)
    {
        double[] prices = {1.57, 4.78, 6.48, 1.60, 7.91, 5.65, 9.16, 3.59, 6.44, 1.88, 8.37, 0.50, 1.00, 4.41, 8.51, 2.36, 9.42, 2.79, 4.27, 6.63};
        double total = 0.00;
        double totalLessThan5 = 0.00;
        double avg = 0.00;
        double[] higherThanAvg= new double[20];
        for(int i=0; i<prices.length; i++)
        {
            total += prices[i];
            if (prices[i] < 5.00)
                totalLessThan5 += prices[i];
        }
        avg = total/prices.length;
        
        for(int i=0; i<prices.length; i++)
        {
            int j = 0;
            if(prices[i] > avg)
            {
                higherThanAvg[j] = prices[i];
                j++;
            }
        }
        System.out.println("The total is " + total );
        System.out.println("The total of values less than 5 is " + totalLessThan5 );
        System.out.println("The average price is " + avg);
        System.out.println("The prices that are higher than average are: ");
    }
}
