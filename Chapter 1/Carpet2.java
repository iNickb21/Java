public class Carpet2
{
    public static void main(String[] args)
    {
       double h = 10;
       double w = 20;
       double priceSquareFoot = 2;
       double area;
       double price;
              
       System.out.println("carpet width: " + w);

       System.out.println("carpet height:  " + h);
       
       area = h*w;
       
       System.out.println("carpet price: " + priceSquareFoot);
       
       price = area*priceSquareFoot;
       
       area = Math.round(area * 100);
       area = area/100;
       
       price = Math.round(price * 100);
       price = price/100;
       
       System.out.println("Carpet Area: " + area + " Square Feet, Price: $" + price);
       
       System.out.println();          
    }
}
