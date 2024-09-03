package StringBuilder;

import java.util.Scanner;

public class PellindromicSubstring {
	
	public static boolean ispell(StringBuffer sb)
	{
		StringBuffer sb1=new StringBuffer(sb);
		sb1.reverse();
		
		if(sb.compareTo(sb1)==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PellindromicSubstring p=new PellindromicSubstring();
		StringBuffer sb=new StringBuffer("forGeeksskeeGfor");
		
		while(!PellindromicSubstring.ispell(sb))
		{
			System.out.println(sb);
			sb.deleteCharAt(sb.length()-1);
			
		}
		System.out.println(sb);

	}

}
