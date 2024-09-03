package String;

import java.util.Scanner;

public class ReverseImp {

	ReverseImp()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the String:");
		StringBuffer sb=new StringBuffer(sc.next());
		String s=new String(sb);
		String str="";
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(Character.isAlphabetic(ch[i])&&Character.isAlphabetic(ch[j]))
				{
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
					System.out.println(ch[i]);
				}
			}
		}
		for(int i=0;i<ch.length;i++)
		{
			str+=ch[i];
			//System.out.print(ch[i]+" ");
		}
		System.out.println(str);
		
		//sb.reverse();
		//System.out.println("Reversed the String");
		//System.out.println(sb);
				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseImp R=new ReverseImp();

	}

}
