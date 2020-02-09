package constructor;

public class ConstructorDemo {
	
	ConstructorDemo(){
		
		System.out.println("default constructor");
	}
	
	
	ConstructorDemo(int a){
		
		System.out.println("Constructor: " +a);
	}
	
	public static void main(String[] args) {
		ConstructorDemo constructorDemo=new ConstructorDemo();
		
	}

}
