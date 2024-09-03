package StringPractice;

import java.util.Scanner;

public class LastEleRemove {
	
	void String()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the elemnt in String");
		String str=sc.next();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=str.charAt(str.length()-1))
			{
				System.out.print(str.charAt(i));
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LastEleRemove l=new LastEleRemove();
		l.String();

	}

}
