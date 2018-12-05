import java.util.Scanner;
public class MinutesConversion
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of minutes: ");
    int minutes = input.nextInt();
    double hours = (double) minutes / 60;
    double days = (double) minutes / (60.00 * 24);
    System.out.println(minutes + " minutes is approximately " + hours
                       + " hours and " + days + " days");
  }
}

