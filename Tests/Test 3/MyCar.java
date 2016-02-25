//Harold Boyett
public class MyCar
{
    private String type = "";
    private String color = "";
    
    public MyCar()
    {
        type = "smart car";
        color = "purple";
    }
    
    public MyCar(String t, String c)
    {
        type = t;
        color = c;
    }
    
    public String getType()
    {
       return type;
    }
    
    public void setType(String t)
    {
       type = t;
    }
    
    public String getColor()
    {
       return color;
    }
    
    public void setColor(String c)
    {
       color = c;
    }
}
