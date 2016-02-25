public class Pizza
{
    // instance variables - replace the example below with your own
    private int size;
    private double price;
    private String toppings;
    
    public Pizza()
    {
        size = 16;
        price = 15;
        toppings = "Cheese";
    }

    public Pizza(int s, double p, String t)
    {
        size = s;
        price = p;
        toppings = t;
        
    }
    
    public int getSize()
    {
       return size;    
    }
    public void setSize(int s)
    {
        size = s;
    }
    public double getPrice()
    {
       return price;    
    }
    public void setPrice(double p)
    {
        price = p;
    }
    public String getToppings()
    {
       return toppings;    
    }
    public void setToppings(String t)
    {
        toppings = t;
    }
}
