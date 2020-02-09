package New;

import java.util.Scanner;

public class NewDemo {
	
	
	   public static void main(String args[])
	   {
	      int x, y, z;

	      System.out.println("Enter three number to find the greatest of the three number:  ");
	      Scanner in = new Scanner(System.in);
	     
	      x = in.nextInt();
	      y = in.nextInt();
	      z = in.nextInt();
	      
	      
	    		if (x>y && x>z) {
	    			System.out.printf("First number is greater");
	    		}
	    		else if(y>z) {
	    			System.out.printf("Second Number is greater");
	    		}	    		
	    		else  {
	    			System.out.printf("Third number is greater");
	    		}
	     
	

}
}
