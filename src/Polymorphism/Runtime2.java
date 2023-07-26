package Polymorphism;

public class Runtime2 extends Runtime1{
	public void demo() {//overriding method of parent class by changeing its body or defination   
		System.out.println("hello pravin");
		
	}
	public void demo1(int a ,int b) {
		System.out.println(a+b);
		System.out.println(a*b);
		
	}
	public static void main(String[] args) {
		Runtime2 exe=new Runtime2();
		exe.demo();
		
	}

}
