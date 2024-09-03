package String;

import java.util.Scanner;

public class StringReplace {
	void Strng()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the String:");
		String s1=sc.nextLine();
	
		String s2=s1.replace("java","python");
	
		
		System.out.println(s2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringReplace s=new StringReplace();
		s.Strng();

	}

}
