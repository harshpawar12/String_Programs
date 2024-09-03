package String;

import java.util.Scanner;

public class SubStringMethod {
	
	void String()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the Elemnt in array:");
		String str=sc.next();
		
		System.out.println("the subString at Start:");
		
		System.out.println("First index:"+str.substring(1));
System.out.println("the subString at Start and End");
		
		System.out.println("First index:"+str.substring(1,4));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubStringMethod s=new SubStringMethod();
		s.String();

	}

}
