
/** 
 * @author Nick 
 * @version 5-2-2016
 */
public class HairSalon
{
    private String serviceName; 
    private double servicePrice;
    private int serviceMinutes;
    
    public HairSalon(String cut, double price, int min)
    {
        serviceName = cut;
        servicePrice = price;
        serviceMinutes = min;
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
