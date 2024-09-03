package StringPractice;

import java.util.Scanner;

public class StringRemoveFirst {

		void String()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enetr the element in String");
			String str=sc.next();
			System.out.println("First Element Removing in String");
			for(int i=0;i<str.length();i++)
			{
				if(str.charAt(i)!=str.charAt(0))
				{
					System.out.print(str.charAt(i));
				}
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringRemoveFirst s=new StringRemoveFirst();
		s.String();

	}

}
