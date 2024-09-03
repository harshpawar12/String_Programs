package StringBuffer;

import java.util.Scanner;

public class CountBufferech {
	
	CountBufferech()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the String:");
		StringBuffer sb=new StringBuffer(sc.next());
		
		for(int i=0;i<sb.length();i++)
		{
			int c=1;
			for(int j=i+1;j<sb.length();j++)
			{
				if(sb.charAt(i)==sb.charAt(j))
				{
					c++;
					sb.deleteCharAt(j);
					j--;
				}
			}
			System.out.println(sb.charAt(i)+" occurence: "+c);

			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountBufferech n=new CountBufferech();

	}

}
