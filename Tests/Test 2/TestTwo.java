/**
 * Harold Boyett
 * Test 2
 */
public class TestTwo
{
    public static void main(String[] args)
    {
        Me harold = new Me();
        Me otherPerson = new Me();
        otherPerson.setStudentName("Alex");
        otherPerson.setGradYear(2018);
        
        System.out.println("My name is " + harold.getStudentName() + " and I will graduate in the year " + harold.getGradYear() + ".");
        System.out.println("My name is " + otherPerson.getStudentName() + " and I will graduate in the year " + otherPerson.getGradYear() + ".");
    }
}
