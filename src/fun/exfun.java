package fun;

import java.util.Scanner;

public class exfun {
	public static void printmyname(String name) {
		System.out.println(name);
	//return name ;
		
	}
public static void main(String a[]) {
	Scanner sc =new Scanner(System.in);
	//exfun obj=new exfun();
	System.out.println("eneter value");
    String name=sc.next();
    printmyname(name);
	sc.close();
	
}
}
