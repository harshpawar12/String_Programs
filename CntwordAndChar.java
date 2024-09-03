package StringPractice;

import java.util.Scanner;

public class CntwordAndChar {
	
	CntwordAndChar()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the String:");
		String s=sc.nextLine();
		String s1[]=s.split(" ");
		System.out.println(s1.length);
		char ch[]=s.toCharArray();
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
				if(ch[i]!=' ')
				{
				System.out.println(ch[i]+":count is:"+c);
				}
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CntwordAndChar c=new CntwordAndChar();

	}

}
