import java.util.Scanner;
public class EvenEntryLoop
{
  public static void main (String args[])
  {
    Scanner input = new Scanner(System.in);
    int number = input.nextInt();
    System.out.print("Please enter a number or 999 to quit: ");
      
    while(number != 999)
    {
      if(number % 2 == 0)
      {
          System.out.println("Good job!");
      }
        else
        {
            System.out.println(number + " is not an even number. Please try again.");
        }
      System.out.print("Please enter a number or 999 to quit: ");
      number = input.nextInt();
    }
  }
}
