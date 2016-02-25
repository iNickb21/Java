
/**
 * Write a description of class PizzaRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PizzaRunner
{
    public static void main(String[] args)
    {
        Pizza one = new Pizza();
        System.out.println(one.getSize());
        Pizza two = new Pizza();
        System.out.println(two);
        two.setSize(12);
        two.setToppings("pepperoni and Sausage");
        System.out.println(two.getSize() + two.getToppings());
        
    }
}
