package keywords;

public class ThisKey {
	int id;
    String name;
    
    ThisKey(){
    	this("abcd");
    	System.out.println("Inside default constructor");
    }
    
	
	ThisKey(int id,String name){
		this.id=id;
		this.name=name;
		System.out.println("constructor body: id : "+id+"\nName : "+name);
		
	}
	
	
	private void showData() {
		this.getData();
		System.out.println("Method body: id : "+id+"\nName : "+name);
	}
	
	private void getData() {
		System.out.println("Inside get data"
				+ "");
	}
	
	
	public static void main(String[] args) {
		ThisKey key=new ThisKey(1,"abcd");
		key.showData();
	}



}
