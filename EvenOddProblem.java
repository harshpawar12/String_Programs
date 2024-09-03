package StringMostImp;

import java.util.Scanner;

public class EvenOddProblem {
/*
 * Input: S = "abbbcc"
Output: "ODD"
Explanation: X = 0 and Y = 1 so (X + Y) is
ODD. 'a' occupies 1st place(odd) in english
alphabets and its frequency is odd(1), 'b'
occupies 2nd place(even) but its frequency
is odd(3) so it doesn't get counted and 'c'
occupies 3rd place(odd) but its frequency
is even(2) so it also doesn't get counted.

 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the String:");
		String str=sc.next();
		char ch[]=str.toCharArray();
		int x=0,y=0;int c=0;
		for(int i=0;i<ch.length;i++)
		{
			
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					c++;
				}
			}
			if(ch[i]%2==0 && c==0)
			{
				x++;
			}
			if(ch[i]%2!=0 && c!=0)
			{
				y++;
			}
		}
		if((x+y)%c!=0)
		{
			System.out.println("ODD");
		}
		else
		{
			System.out.println("Even");
		}

	}

}
