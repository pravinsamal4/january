package STAR;

public class star2 {
	public static void main(String[] args) {
//		int s=22;

		for(int a=1;a<=4; a++)
		{
			int p=1;
			for(int b=1; b<=a; b++)
			{
				p =p*(a-b);

				System.out.print(p);
			}
			System.out.println( );
		}
	}

}
