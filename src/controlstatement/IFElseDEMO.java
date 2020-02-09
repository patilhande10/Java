package controlstatement;

import java.util.Scanner;

public class IFElseDEMO {
	
	int number;
	
	
	void checkIfElse(int number) {
		
		if (number%2==0) {
			System.out.printf(number+ " is an Even Number.");
		}
		
		else {
			System.out.printf(number+ "is an Odd Number.");
		}
		
		
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		IFElseDEMO demo=new IFElseDEMO();
		Scanner scanner=new Scanner(System.in);
		System.out.printf("Enter Number : ");
		int number=scanner.nextInt();
		demo.checkElseIf(number);
	}





void checkElseIf(int number) {
	if (number<35) {
		System.out.printf("FAIL");
	}
	else if(number>=35 && number<60) {
		System.out.printf("Pass Class");
	}
	else if(number>=60 && number<74) {
		System.out.printf("First class");
	}---
	else if(number>=74 && number<=100) {
		System.out.printf("Distinction");
	}
	else  {
		System.out.printf("Invalid");
	}
	
	
}
}
