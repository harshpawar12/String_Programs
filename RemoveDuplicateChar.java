package StringPractice;

import java.util.Scanner;

/*
 * 11.Wap enter a string and remove all 
 * duplicate character using class and object.

 */
public class RemoveDuplicateChar {
	
	void String()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the String:");
		String s=sc.next();
		
		char ch[]=s.toCharArray();
		System.out.println("finding the dupkicates:");
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					ch[i]=1;
				}
			}
			
		}
		String snew="";//Store in second String.
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=1)
			{
				snew = snew+ch[i]; // Stovering in second String
			//	System.out.println(ch[i]+" ");
			}
		}
		System.out.println("the Original String is:");
		System.out.println(snew);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicateChar R=new RemoveDuplicateChar();
		R.String();

	}

}
