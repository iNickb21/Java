public class Student
{
   private int studentId; 
   private int creditHours;
   private double pointsEarned;
   
    public Student()
    {
        studentId = 9999; 
        creditHours = 3;
        pointsEarned = 12;
    }

    public Student(int s, int c, double p)
    {
        studentId = s; 
        creditHours = c;
        pointsEarned = p;
        
    }
    
    public int getStudentId()
    {
       return studentId;    
    }
    public void setStudentId(int s)
    {
       studentId = s;
    }
    public double getCreditHours()
    {
       return creditHours;    
    }
    public void setCreditHours(int c)
    {
       creditHours = c;
    }
    public double getPointsEarned()
    {
       return pointsEarned;    
    }
    public void setPointsEarned(double p)
    {
       pointsEarned = p;
    }
    public double getGPA()
    {
       return pointsEarned/creditHours;    
    }
}
