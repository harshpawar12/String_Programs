package StringMostImp;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Input: S = "AC2BEW3"
Output: "ABCEW5"
Explanation: 2 + 3 = 5 and we print all
alphabets in the lexicographical order.

 */
public class RearrangeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the String:");
		String s1=sc.next();
		char ch[]=s1.toCharArray();
		Arrays.sort(ch);
		System.out.println(Arrays.toString(ch));
		int sum=0;
		
		
		for(int i=0;i<ch.length;i++)
		{
			if(Character.isDigit(ch[i])==false)
			{
				System.out.print(ch[i]+"");
			}
			else
			{
				sum+=Character.getNumericValue(ch[i]);
			}
			
		}
		System.out.print(sum);
		
	}

}
