package innerclassess;

public class MemberInnerClass {
	
	private String password = "abc123#";
	
	
	class CheckMemberInnerClass{
		
	
	String showPassword() {
		return password;
		
		
	}

}

public static void main(String[] args) {
	MemberInnerClass memberInnerClass=new MemberInnerClass();
	MemberInnerClass.CheckMemberInnerClass checkMemberInnerClass=memberInnerClass.new CheckMemberInnerClass();
	System.out.println(checkMemberInnerClass.showPassword());
}

}
