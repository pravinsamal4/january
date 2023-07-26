package fun;

public class star {
	public void tri() {
		for (int a=1; a<=5; a++)
		{
			for(int c=5; c>=a; c--)
			{
				System.out.print(" ");
			}
			for(int b=1; b<=a; b++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}
	public void star1() {
		for (int d=5; d>=1; d--) {
			{
				for(int e=5; e>=d; e--)
				{
					System.out.print(" ");
				}

				for(int f=1; f<=d; f++)
				{
					System.out.print(" *");
				}
				System.out.println();
			
			}
		}
			
		
	}
	
	public static void main(String[] args) {
		star obj=new star();
		obj.tri();
		obj.tri();
		obj.star1();
	}

}
