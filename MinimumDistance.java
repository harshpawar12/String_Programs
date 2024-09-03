package String;

import java.util.Scanner;

/*
 * Input: S = { “the”, “quick”, “brown”, “fox”, “quick”}, 
 * word1 = “the”, word2 = “fox”
Output: 3
Explanation: Minimum distance between the words
 “the” and “fox” is 3


 */
public class MinimumDistance {
	
	MinimumDistance()
	{
		String s[]={"the","quick","brown","fox","quick"}; 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first String:");
		String s1=sc.next();
		System.out.println("Enter the second String:");
		String s2=sc.next();
		int temp=0;
		int temp1=0;
		for(int i=0;i<s.length;i++)
		{
			if(s[i].equals(s1))
			{
				temp=i;
			}
			if(s[i].equals(s2))
			{
				temp1=i;
			}
		}
		
		int c=0;
		for(int i=temp;i<=temp1;i++)
		{
			c++;
		}
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinimumDistance h=new MinimumDistance();

	}

}
