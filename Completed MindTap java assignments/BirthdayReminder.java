import java.util.*;
import java.util.Scanner;
public class BirthdayReminder
{
public static void main(String[] args)
{
Scanner input = new Scanner(System.in);
String birth[] = new String[10];
String names[] = new String[10];
String a[] = new String[100];

for(int i=0; i<10; i++)
   {
   System.out.println("Enter name");
   names[i]= input.nextLine();
   if(names[i].equals("ZZZ"))
   {
        System.out.println(i); 
       for(int x=0; x<=i; x++)
       {
       System.out.println(names[x]);           
    }
    break;
    }

    else if(i==9)
   {
       System.out.println(i+1);
       for(int y=0; y<10; y++)
       {
       System.out.println(names[y]); 
    }  
    }
   else
   {
    System.out.println("Enter Birthday");
    birth[i]= input.nextLine();

   }
}
System.out.println("Enter name to get their Birthday");
for(int j=1;j>0;j++){
   a[j]= input.nextLine();
   if(a[j].equals("ZZZ"))
   break;
   for(int k=0; k<10;)
    if(a[j].equals(names[k]))
    {
     System.out.println(birth[k]);
     break;
    }
     else if(k<10&&!a.equals(names[k]))
     k++;
     else
     System.out.println("Name not found");
    }
  }
}
