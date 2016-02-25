
/**
 * Write a description of class DemoVariables here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DemoVariables
{
    public static void main()
    {
       int oneInt = 315;
       System.out.println("The int is " +oneInt);
       short oneShort = 23;
       long oneLong = 123456789876543L;
       System.out.println("The short is " +oneShort);
       System.out.println("The long is " +oneLong);
       int value1 = 43, value2 = 10, sum, difference, product, quotient, modulus;
       sum = value1+value2;
       difference = value1 - value2;
       product = value1 * value2;
       quotient = value1 / value2;
       modulus = value1 % value2;
       
       System.out.println("sum = " + sum + ", difference = " + difference + ", product = " + product + ", quotient = " + quotient + ", modulus = " + modulus);
       boolean isProgrammingFun = true, isProgrammingHard = false;
       System.out.println("The value of isProgrammingFun is " +isProgrammingFun + ". \nThe value of isProgrammingHard is " + isProgrammingHard + ".");
       double doubNum1 =2.3, doubNum2 = 14.8, doubResult;
       doubResult = doubNum1 + doubNum2;
       System.out.println("The sum of the doubles is " + doubResult);
       doubResult = doubNum1 * doubNum2;
       System.out.println("The product of the doubles is " + doubResult);
       System.out.println("\nThis is on one line\nthis is on another");
       System.out.println("This shows \thow \ttabs \twork");
    }
}
