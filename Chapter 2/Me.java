public class Me
{
    private String name = "";
    private int gradYear = 0;
    
    public Me()
    {
        name = "Harold Boyett";
        gradYear = 2017;
    }
    
    public String getStudentName()
    {
       return name;
    }
    
    public void setStudentName(String n)
    {
       name = n;
    }
    
    public int getGradYear()
    {
       return gradYear;
    }
    
    public void setGradYear(int y)
    {
       gradYear = y;
    }
}
