package Calculation;


import java.util.Scanner;
public class SubNumbers
{
   public static void main(String args[])
   {
      int x, y, z;

      System.out.println("Enter two numbers to calculate their Subtraction: ");
      Scanner in = new Scanner(System.in);
     
      x = in.nextInt();
      y = in.nextInt();
      z = x - y;
     
      System.out.println("Sub of the two numbers = " + z);
   }
}
