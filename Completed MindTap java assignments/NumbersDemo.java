import java.util.Scanner;
public class NumbersDemo
{
   public static void main (String args[])
   {
      int x = -1;
      int y = -50;
      int a = -10;
      int b = 13;
      int l = 21;
      int r = 3;

      displayNumberPlusFive(x, y);
      displayNumber2PlusFive(a, b);
      displayNumber3PlusFive(l, r);
      displayTwiceTheNumber(x, y);
      displayTwiceTheNumber2(a, b);
      displayTwiceTheNumber3(l, r);
      displayNumberSquared(x, y);
      displayNumberSquared2(a, b);
      displayNumberSquared3(l, r);
   }
   
   public static void displayNumberPlusFive(int x, int y)
   {
       System.out.println(x+" plus five is: "+(x+5) );
       System.out.println(y+" plus five is: "+(y+5) );
   }

       public static void displayNumber2PlusFive(int a, int b)
   {
       System.out.println(a+" plus five is: "+(a+5) );
       System.out.println(b+" plus five is: "+(b+5) );
   }
    
       public static void displayNumber3PlusFive(int l, int r)
   {
       System.out.println(l+" plus five is: "+(l+5) );
       System.out.println(r+" plus five is: "+(r+5) );
   }
    
   public static void displayTwiceTheNumber(int x, int y)
   {
       System.out.println(x+" times two is: "+(x*2) );
       System.out.println(y+" times two is: "+(y*2) );
   }

    public static void displayTwiceTheNumber2(int a, int b)
   {
       System.out.println(a+" times two is: "+(a*2) );
       System.out.println(b+" times two is: "+(b*2) );
   }
    
    public static void displayTwiceTheNumber3(int l, int r)
   {
       System.out.println(l+" times two is: "+(l*2) );
       System.out.println(r+" times two is: "+(r*2) );
   }
    
   public static void displayNumberSquared(int x, int y)
   {
       System.out.println(x+" squared is: "+(x*x) );
       System.out.println(y+" squared is: "+(y*y) );
   }
    
       public static void displayNumberSquared2(int a, int b)
   {
       System.out.println(a+" squared is: "+(a*a) );
       System.out.println(b+" squared is: "+(b*b) );
   }
   
       public static void displayNumberSquared3(int l, int r)
   {
       System.out.println(l+" squared is: "+(l*l) );
       System.out.println(r+" squared is: "+(r*r) );
   }
    
}
