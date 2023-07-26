package inheritance;

public class Child extends Parent{
	int f=40;
	String place ="solapur";
	
	public void demo() {
		System.out.println("hello");
		
	}
	public static void main(String[] args) {
		Child ex=new Child();
		ex.addition(44,55);
		ex.demo();
		System.out.println(ex.a);
		System.out.println( ex.a);
		System.out.println(ex.name);
		System.out.println(ex.place);
//		int q=ex.w;
		System.out.println(ex.w);
	}
	

}
