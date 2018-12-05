import java.util.Scanner;
class EvenOdd
{
   public static void main(String[] args) 
   {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter an integer >> ");
      int num = input.nextInt();
      
      boolean remainder = isEven(num);
      if (remainder == true)
          System.out.println("The integer entered is even.");
      else
          System.out.println("The integer entered is odd.");
   }
   public static boolean isEven(int number)
   {
      if (number % 2 == 0)
          return true;
      else
          return false;
   }
}
