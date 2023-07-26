package inheritance;

public class Grand extends Child{
	public void test() {
		System.out.println("Property of grand child");
	}
	public static void main(String args[]) {
		Grand obj1= new Grand();
			obj1.test();
			obj1.demo();
			obj1.addition(77,88);
		System.out.println(obj1.a);
		System.out.println(obj1.name); 
		System.out.println(obj1.place);
	}
	

}
