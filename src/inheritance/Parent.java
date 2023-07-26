package inheritance;

public class Parent {
	int a=20;
	int w=50;
	String name="pravin";
	public void addition(int a,int b) {
		int c=a+b;
	System.out.println(c);
		
	}
	public static void main(String[] args) {
		Parent obj= new Parent();
		obj.addition(10,20);
		
		
		
	}

}
