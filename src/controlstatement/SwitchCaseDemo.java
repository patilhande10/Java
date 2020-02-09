package controlstatement;

import java.util.Scanner;

public class SwitchCaseDemo {
	
	
	public static void main(String[] args) {
		SwitchCaseDemo switchCaseDemo=new SwitchCaseDemo();
		switchCaseDemo.doSwitchCase();
		}

	void doSwitchCase() {
		System.out.printf("Enter the values of a and b :");
		Scanner scanner=new Scanner(System.in);
		int  a=scanner.nextInt();
		int  b=scanner.nextInt();
		
		System.out.println("1. Add\n2. Sub\n3. Mul\n4. Div\n");
		System.out.println("Enter your choice: ");
		int choice=scanner.nextInt();
		switch(choice){
		
		case 1: 
			System.out.println("Addition : " +(a+b));
			break;
		case 2: 
			System.out.println("Subtraction : " +(a-b));
			break;
		case 3: 
			System.out.println("Multiplication : " +(a*b));
			break;
		case 4: 
			System.out.println("Division : " +(a/b));
			break;
		
		}	
		
	}

}
