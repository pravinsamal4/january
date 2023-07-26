package Polymorphism;

public class CompileTime {
	public void test() {
		System.out.println("method1");
	}
	public void test(int a) {
		System.out.println("method2");
	}
	public void test(double b,int c) {
		System.out.println("method3");
		
	}
	public static void main(String[] args) {
		CompileTime obj=new CompileTime();
		obj.test();
		obj.test(1);
	}
	

}
