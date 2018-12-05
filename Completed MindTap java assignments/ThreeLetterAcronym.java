import java.util.Scanner;
public class ThreeLetterAcronym
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Please enter words.");
      // s = keyboard.nextLine();
      char a = keyboard.next().charAt(0);
      a = Character.toUpperCase(a);
      char b = keyboard.next().charAt(0);
      b = Character.toUpperCase(b);
      char c = keyboard.next().charAt(0);
      c = Character.toUpperCase(c);
       
      System.out.println("Your Acronym is " + a + b + c);
   }
}
