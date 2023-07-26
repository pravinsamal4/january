package fun;

public class variable {
	static int a=20;
	int c=40;
	
	public void add()
	{
		int b=30;
	//System.out.println(b);
	}
	private void sub() {
		System.out.println(a);

		
	}
	public static void main(String[] args) {
	variable obj=new variable();
		System.out.println(variable.a);
      obj.sub();
      obj.add();
	int d =obj.c;
    System.out.println(obj.c);	
    System.out.println(d);
	}

}
