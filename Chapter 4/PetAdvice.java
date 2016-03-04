import java.util.Scanner;
public class PetAdvice 
{
 public static void main(String[] args) 
 {

  String firstLetter = "";
  String secondLetter = "";

  Scanner scanner = new Scanner(System.in);

  for (;;) 
  {
   try 
   {
    System.out.println("Please type A, H, or D for apartment, house, or dormitory.");
    firstLetter = scanner.next();
    System.out.println("How many hours are you home on an average day?");
    System.out.println("A)18 or more");
    System.out.println("B)10 to 17");
    System.out.println("C)8 to 9");
    System.out.println("D)6 to 7");
    System.out.println("E)0 to 5");
    secondLetter = scanner.next();
    System.out.println(petPicker(firstLetter, secondLetter));
   } 
   catch (NumberFormatException nfe) 
   {
    System.out.println("Not an answer.");
   }

  }
 }
 public static String petPicker(String one, String two) 
 {
  String goodPet = "";
  String youShouldGet = "The best pet for you would be ";

  if (one.matches("A|D|H|a|d|h") && two.matches("A|B|C|D|E|a|b|c|d|e")) 
  {


   if ((one.equals("H") || one.equals("h")) && (two.equals("A") || two.equals("a")))
    goodPet = "a Pot bellied pig.";

   else if ((one.equals("H") || one.equals("h")) && (two.equals("B") || two.equals("C") || two.equals("b") || two.equals("c")))
    goodPet = "a Dog.";

   else if ((one.equals("H") || one.equals("h")) && (two.equals("D") || two.equals("E") || two.equals("d") || two.equals("e")))
    goodPet = "a Snake.";

   else if ((one.equals("A") || one.equals("a")) && (two.equals("A") || two.equals("B") || two.equals("a") || two.equals("b")))
    goodPet = "a Cat.";

   else if ((one.equals("A") || one.equals("a")) && (two.equals("C") || two.equals("D") || two.equals("E") || two.equals("c") || two.equals("d") || two.equals("e")))
    goodPet = "a Hamster.";

   else if ((one.equals("D") || one.equals("d")) && (!(two.equals("E") && !(two.equals("e")))))
    goodPet = "a Fish.";

   else if ((one.equals("D") || one.equals("d")) && (two.equals("E") || two.equals("e")))
    goodPet = "an Ant farm.";


   goodPet = youShouldGet + goodPet + "\n";
  } 
  else goodPet = "THATS NOT AN OPTION STUPID!";

  return goodPet;
 }
}