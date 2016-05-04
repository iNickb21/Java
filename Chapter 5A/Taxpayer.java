/** 
 * Chapter 5A Ex 3
 * 
 * @author Nick 
 * @version 5-2-2016
 */

import java.util.Scanner;

public class Taxpayer
{
    int socialSecurity;
    double yearlyGrossIncome;
    public static void main(String[] args)
    {
        
        //  double[] incomes = {93880, 49582, 50510, 50056, 59859, 30839, 46813, 76180, 38536, 27530};
        Taxpayer[] taxPayers = new Taxpayer[10];
        for(int i=0;i<10;i++)
        {
            //taxPayers[i] =  new Taxpayer(i+1,incomes[i]);
            taxPayers[i] =  new Taxpayer(i+1,(i+1)*10000);
        }
        for(int i=0;i<taxPayers.length;i++)
        {
            System.out.println(taxPayers[i].getSocialSecurity() + " has a yearly income of " + taxPayers[i].getYearlyGrossIncome());
        }
        
    }
    public Taxpayer(int s, double g)
    {
        socialSecurity = s;
        yearlyGrossIncome = g;
    }
    
    public int getSocialSecurity()
    {
        return socialSecurity;
    }
    
    public double getYearlyGrossIncome()
    {
        return yearlyGrossIncome;
    }
}
