package StringPractice;

import java.util.Scanner;

public class CompareTo {

	void String()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the first String:");
		String s=sc.next();
		System.out.println("Enetr the second String:");
		String s1=sc.next();
		if(s.compareTo(s1)>0)
		{
			System.out.println("String first is greate than second");
		}
		else if(s.compareTo(s1)<0)
		{
			System.out.println("String second is greater than first");
		}
		else
		{
			System.out.println("both String are equvals..");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method 
		CompareTo c=new CompareTo();
		c.String();

	}

}
