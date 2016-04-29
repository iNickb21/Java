
/**
 * Write a description of class SalonServices here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HairSalon
{
    private String serviceName; 
    private double servicePrice;
    private int serviceMinutes;
    
    public HairSalon(String cut, double price, int min)
    {
        cut = serviceName;
        price = servicePrice;
        min = serviceMinutes;
    }
    
    public String getServiceName()
    {
        return serviceName;
    }
    public double getServicePrice()
    {
        return servicePrice;
    }
    public int getServiceMinutes()
    {
        return serviceMinutes;
    }
}
