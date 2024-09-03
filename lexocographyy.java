package String;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Q18. Ordering of strings 
 You will be given N number of strings. You have to find the
  lexicographically smallest string and
 the lexicographically largest string among these strings.
 Example 1:
 Input:
 N=3
 strings = a , ab , abc
 Output: a abc
 Explanation: Lexicographically smallest is
 "a" and lexicographically largest is
 "abc"
 */
public class lexocographyy {
	
	lexocographyy()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the size String:");
		int size=sc.nextInt();
		System.out.println("String are:");
		String[] str=new String[size];
		
		for(int i=0;i<str.length;i++)
		{
			str[i]=sc.next();
		}
		Arrays.sort(str);
		System.out.println(Arrays.toString(str));
	System.out.println(str[0]+" ");
	System.out.println(str[str.length-1]+"");
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lexocographyy h=new lexocographyy();

	}

}
