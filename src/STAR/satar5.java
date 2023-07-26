package STAR;

public class satar5 {
	public static void main(String[]args)
	{
		for (int a=1; a<=5; a++)//
		{
			for (int b=1; b<=a; b++)//1
			{
				System.out.print(" ");
				
			}
			for (int c=5; c>=a; c--)//5 4 3 2 1
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}

}
