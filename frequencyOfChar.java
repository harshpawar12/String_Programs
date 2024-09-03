package StringPractice;

import java.util.Scanner;

/*
 * Q4.Write a Java program to count frequency
 *  of each character in a string.
 */
public class frequencyOfChar {

		void Strimg()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enetr the String:");
			String s=sc.next();
			
		char ch[]=s.toCharArray();
			for(int i=0;i<ch.length;i++)
			{
				int c=1;
				for(int j=i+1;j<ch.length;j++)
				{
					if(ch[i]==ch[j])
					{
						c++;
						ch[j]='\0';
					}
				}
				if(ch[i]!='\0')
				{
					System.out.println(" "+ch[i]+" count is:"+c);
				}
			}
			

		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		frequencyOfChar f=new frequencyOfChar();
		f.Strimg();
	}

}
