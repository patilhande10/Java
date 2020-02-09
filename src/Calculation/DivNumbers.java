package Calculation;


import java.util.Scanner;
public class DivNumbers
{
   public static void main(String args[])
   {
      int x, y, z;

      System.out.println("Enter two numbers to calculate their division: ");
      Scanner in = new Scanner(System.in);
     
      x = in.nextInt();
      y = in.nextInt();
      z = x / y;
     
      System.out.println("Division of the two numbers = " + z);
   }
}
