/**
 * Chapter 3A Ex 2 (Pay)
 * 
 * @author Harold Boyett 
 * @version 4-27-2016
 */

public class Pay
{
    private double hoursWorked;
    private double grossPay;
    private double netPay;
    private double payRate;
    private double withholdingRate;

    
    public static void main(String[] args)
    {
        Pay pay = new Pay();
        double pay1 = pay.computeNetPay(40.00d,7.25d,10.0d);
        System.out.println("hoursWorked payRate withholdingRate" + pay1);
        double pay2 = pay.computeNetPay(40.00d,10.0d);
        System.out.println("hoursWorked payRate " + pay2);
        double pay3 = pay.computeNetPay(40.00d);
        System.out.println("hoursWorked " + pay3);
    }
    public double computeNetPay(double hoursWorked, double payRate, double withholdingRate)
    {
        grossPay = hoursWorked * payRate;
        double withholding = grossPay * withholdingRate / 100;
        netPay = grossPay - withholding;
        return netPay;
    }
    public double computeNetPay(double hoursWorked, double payRate)
    {
        withholdingRate = 15;
        grossPay = hoursWorked * payRate;
        double withholding = grossPay * withholdingRate /100;
        netPay = grossPay - withholding;
        return netPay;
    }
    public double computeNetPay(double hoursWorked)
    {
        payRate = 4.65;
        grossPay = hoursWorked * payRate;
        double withholding = grossPay * withholdingRate /100;
        netPay = grossPay - withholding;
        return netPay;
    }
}