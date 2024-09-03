package StringBuffer;

import java.util.Scanner;

public class countString {
	
	countString()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the String:");
		StringBuffer sb=new StringBuffer(sc.next());
		String s1=new String(sb);
		char ch[]=s1.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			int c=1;
			for(int j=i+1;j<ch.length;j++)//aaabba
			{
				if(ch[i]==ch[j])
				{
					i++;
					c++;
				}
				else
				{
					break;
				}
			}
			System.out.print(ch[i]+""+c);

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countString n=new countString();

	}

}
