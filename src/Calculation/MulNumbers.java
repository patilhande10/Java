package Calculation;


import java.util.Scanner;
public class MulNumbers
{
   public static void main(String args[])
   {
      int x, y, z;

      System.out.println("Enter two numbers to calculate their Multiplication: ");
      Scanner in = new Scanner(System.in);
     
      x = in.nextInt();
      y = in.nextInt();
      z = x * y;
     
      System.out.println("Multiplication of the two numbers = " + z);
   }
}
