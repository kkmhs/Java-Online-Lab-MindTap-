import java.util.Scanner;
public class Insurance
{
    
    final public static int VALUE_TO_ADD = 15;
    final public  static  int VALUE_TO_MULTIPLY = 20;

    public static void main(String[] args)
    {
       
        int currentYear;
        int birthYear;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter the current year in the format 'XXXX' >>> ");
        currentYear = keyboard.nextInt();

        keyboard.nextLine();

        System.out.println("Please enter your year of birth in the format 'XXXX' >>> ");
        birthYear = keyboard.nextInt();


        String str = "Your premium is $%.2f.";
        System.out.printf(str, calculatePremium(currentYear, birthYear));
    }
        public static double calculatePremium(int currentYr, int birthYr)
    {
        int age;
        int decades;
        double premium;

        age = currentYr - birthYr;
        decades = (int) (age / 10);

        premium = (decades + VALUE_TO_ADD) * VALUE_TO_MULTIPLY;

        return premium;

    }
    
}
