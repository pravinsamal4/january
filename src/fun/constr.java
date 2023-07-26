package fun;

public class constr {
	  static String color;
	 static char size;
	 
	public static void put()  {
		System.out.println("shirt is on");
	}
	public static void take() {
		 System.out.println("shirt is up");
	}
//	constr(int a) {
//		System.out.println("pravin");
//	}
	public static void setcolor(String newcolor) {
      color=newcolor;
	}

	public static void setsize(char newsize) {
      size=newsize;
	}
	public static void main(String[] args) {
	constr on=new constr();
	on.setcolor(color);
	on.setsize(size);
System.out.println(on.color);
System.out.println("i");

	}
	

}
