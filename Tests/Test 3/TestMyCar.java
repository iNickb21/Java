//Harold Boyett
import java.util.Date;

public class TestMyCar
{
    public static void main(String[] args)
    {
        MyCar car = new MyCar();
        Date today = new Date();
        
        double currentInSeconds = 0;
        double christmasInSeconds = 1482624000;
        double secondsUntilChristmas = 0;
        double daysUntilChristmas = 0;
        
        System.out.println(today + " I drive a " + car.getColor() + " " + car.getType() + ".");
        
        MyCar futureCar = new MyCar("lambo", "black");
        System.out.println("In five years I will drive a " + futureCar.getColor() + " " + futureCar.getType() + ".");
        
        currentInSeconds = today.getTime() / 1000;     
        secondsUntilChristmas = christmasInSeconds - currentInSeconds;
        daysUntilChristmas = secondsUntilChristmas /60/60/24;
        
        System.out.println(daysUntilChristmas + " days until Christmas.");
        
        System.out.println(Math.pow(daysUntilChristmas, 5));
        
        
        
        
    }
}
