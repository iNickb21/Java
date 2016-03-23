import java.util.Scanner;
public class Exercise4
{
    public static void main(String[] args)
    {
        String[] employeeLastNames = {"Smith","Brown","Johnson","Jones","Williams","Davis","Miller","Wilson","Taylor","Clark","White","Moore","Thompson","Allen","Martin","Hall","Adams","Thomas","Wright","Baker"};

        System.out.print("Enter the employee ID (1-20)");
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        System.out.print("The last name of the employee ID " + input + " is " + employeeLastNames[input] + ".");
    }
}
