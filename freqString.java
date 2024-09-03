package String;

import java.util.Scanner;

public class freqString {
	
	freqString()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the String:");
		String str=sc.next();
		char ch[]=str.toCharArray();
		System.out.println("----------");
		for(int i=0;i<ch.length;i++)
		{
			int c=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					c++;
					ch[j]=1;
				}
			}
			if(ch[i]!=1 && c!=ch[i])
			{
				System.out.println(ch[i]+" Freq:"+c);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		freqString f=new freqString();

	}

}
