package fun;

public class right {
	 int q=10;
	public void exa() {
		for(int a=1; a<=5; a++)
		
		{
			for(int b=1;b<=a;b++)
				{ 
				System.out.print("* ");
				}
		
		
			System.out.println();
		}
		
	}
	public static void xa() {
		for(int a=1; a<=5; a++)
		
		{
			for(int b=1;b<=a;b++)
				{ 
				System.out.print("* ");
				}
		
		
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		right obj=new right();
		obj.exa();
		System.out.println(obj.q);
		right.xa();
		
	}

}
