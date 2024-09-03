package StringBuilder;

import java.util.Scanner;

public class EquvalsMethods {
	
	EquvalsMethods()
	{
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);

		System.out.println("Enetr the String:");
		StringBuilder sb=new StringBuilder(sc.next());
		StringBuilder sb1=new StringBuilder(sc1.next());
		
		if(sb.equals(sb1))
		{
			System.out.println("are equval");
		}
		else
		{
			System.out.println("not equval");
		}
		System.out.println("compare to:");
		if(sb.compareTo(sb1)==0)
		{
			System.out.println("first is equval to second");
		}
		else
		{
			System.out.println("first the not equval to secomd");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EquvalsMethods b=new EquvalsMethods();

	}

}
