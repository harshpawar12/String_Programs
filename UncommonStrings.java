package String;

import java.util.Scanner;

public class UncommonStrings {
	
	UncommonStrings()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the first String:");
		String s1=sc.next();
		System.out.println("Enetr the secod String:");
		String s2=sc.next();
		
		String s3=new String(s1+s2);
		
		for(int i=0;i<s3.length();i++)
		{
			int c=0;
			for(int j=0;j<s3.length();j++)
			{
				if(s3.charAt(i)==s3.charAt(j))
				{
					c++;
			
					
				}
			}
			if(c==1)
			{
				System.out.print(s3.charAt(i));
			}
			
		}
		
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UncommonStrings f=new UncommonStrings();

	}

}
