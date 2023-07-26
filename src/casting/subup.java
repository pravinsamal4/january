package casting;

public class subup extends superup{
	public void demo() {
		System.out.println("this is sub class method");

	}
	public void test() {
    System.out.println("good morning");
	}

	public static void main (String args[]) {
	superup obj= new subup(); //upcasting 
	obj.test();//this is upcasting method
	obj.test2();
	}
	

}
