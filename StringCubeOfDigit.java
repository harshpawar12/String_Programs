package String;

import java.util.Arrays;

public class StringCubeOfDigit{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="1234";
		
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<str.length();i++)
		{
			int n=Character.getNumericValue(str.charAt(i));
			sb.append(n*n*n);
			
		}
		System.out.println(sb);
	
		
		
		
		

	}

}
