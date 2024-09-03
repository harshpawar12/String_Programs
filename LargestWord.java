package StringMostImp;

import java.util.Scanner;

public class LargestWord {
/*
 * Example 1:
Input: d = {"ale", "apple", "monkey", "plea"}
S = "abpcplea"
Output: "apple"
Explanation: After deleting "b", "c"
"a" S became "apple" which is present
in d.

 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String d[]={"ale","apple","monkey","plea"};
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		StringBuffer max=new StringBuffer();
		for(int i=0;i<d.length;i++)
		{
			
			StringBuffer sb=new StringBuffer();
			for(int j=0;j<d[i].length();j++)
			{
				for(int k=0;k<str.length();k++)
				{
					if(d[i].charAt(j)==str.charAt(k))
					{
					sb.append(str.charAt(k));
					break;
					}
				}
			}
			if(sb.length()>max.length())
			{
				max=sb;
			}
		}
		System.out.println(max);
	
	}

}
