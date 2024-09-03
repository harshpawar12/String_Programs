package StringMostImp;

import java.util.Scanner;

public class TwiceCounter {
/*
 * Input:
N = 3
list = {Geeks, For, Geeks}
Output: 1
Explanation: 'Geeks' is the only word that
appears twice.

 */
	public static void main(String[] args) {
		// TODO Auto-generated method 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the String:");
		String str=sc.nextLine();
		String s1[]=str.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			int c=0;
			for(int j=0;j<s1.length;j++)
			{
				if(s1[i].charAt(i)==s1[i].charAt(j))
				{
					c++;
				}
			}
			if(c==1)
			{
				System.out.println(s1[i]);
				break;
			}
		}

	}

}
