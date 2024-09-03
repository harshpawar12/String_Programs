package StringMostImp;

import java.util.Scanner;

/*
 * Input: S = "aaABBb"
Output: "3a3b"

 */
public class FrequencyOfWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the String:");
		StringBuffer sb=new StringBuffer(sc.next());
		String s1=sb.toString();
		s1 = s1.toLowerCase();
		sb=new StringBuffer(s1);
		
		for(int i=0;i<sb.length();i++)
		{
			int c=1;
			for(int j=i+1;j<sb.length();j++)
			{
				if(sb.charAt(i)==sb.charAt(j))
				{
					c++;
					i++;
				}
				else
				{
					break;
				}
				
			}
			if(sb.charAt(i)!=c)
			{
				System.out.print(sb.charAt(i)+""+c);
			}
			
		}

	}

}
