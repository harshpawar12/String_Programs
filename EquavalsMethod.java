package String;

import java.util.Scanner;

public class EquavalsMethod {
	
	void Strring() //Equvals method check content of string
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the first String elememnt:");
		String s1=sc.next();
		System.out.println("Enetr the second String elememnt:");
		String s2=sc.next();
		if(s1.equals(s2))
		{
			System.out.println("Both String are equval:");
		}
		else
		{
			System.out.println("Both string are not equval:");
		}
	}
	void String1()//"=="are then check the Reference of that string
	{
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enetr the first String elememnt:");
		String s1="ram";
		//System.out.println("Enetr the second String elememnt:");
		String s2="harsh";
		if(s1==s2)
		{
			System.out.println("Both String are equval:");
		}
		else
		{
			System.out.println("Both string are not equval:");
		}
	}
	void String2()//"compare to"--> is method are string greater or small.
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the first String elememnt:");
		String s1=sc.next();
		System.out.println("Enetr the second String elememnt:");
		String s2=sc.next();
		if(s1.compareTo(s2)<0)
		{
			System.out.println("Second String Greatest");
	
		}
		else if(s1.compareTo(s2)>0)
		{
			System.out.println("First String are gratest");

		}
		else
		{
			System.out.println("both are Equval");
		}
		
	}
	void Ingnorecase()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the first String elememnt:");
		String s1=sc.next();
		System.out.println("Enetr the second String elememnt:");
		String s2=sc.next();
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("That ignored that and its equval");
	
		}
		
		else
		{
			System.out.println("that not ignored  at");
		}
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EquavalsMethod e=new EquavalsMethod();
		//e.Strring();
		//e.String1();
		//e.String2();
		e.Ingnorecase();

	}

}
