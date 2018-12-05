import java.util.Scanner;

public class CellPhoneService
{
  public static void main(String [] args)
  {
    int talkMinutes, textMessages; 
    double dataGigs;
    
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("Monthly talk minutes used: ");
    talkMinutes = keyboard.nextInt();
    
    System.out.println("Monthly text messages sent: ");
    textMessages = keyboard.nextInt();
    
    System.out.println("Monthly gigabytes of data used: ");
    dataGigs = keyboard.nextDouble();
    
    if (dataGigs >= 2)
      {
        System.out.println("You should get Plan F at $87 per month.");
      }
      if (dataGigs == 2)
      {
        System.out.println("You should get Plan E at $79");
      }  
    if (talkMinutes < 500)
    {
      if (textMessages == 0 && dataGigs == 0)
      {
       System.out.println("You should get Plan A at $49 per month.");
      }
      else if (textMessages > 0 && dataGigs == 0)
      {
        System.out.println("You should get Plan B at $55 per month.");
      }
    }
    if (talkMinutes >= 500)
    {
      if (dataGigs == 0)
      {
        System.out.println("You should get Plan C at $61 per month.");
        System.out.println("Or you could get Plan D at $70 per month.");
      }     
    }
  }
}
