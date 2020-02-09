package Recursion;

public class RecursiveFunction {
	
	 static int count=0;
	void showArrray() {
		
		int array[]= {1,2,3,4,5,6};
		System.out.println(array[count]);
		if (count<array.length-1) {
			count++;
			showArrray();
		}
	}
	
	
	public static void main(String[] args) {
		RecursiveFunction function=new RecursiveFunction();
		function.showArrray();
	}

}
