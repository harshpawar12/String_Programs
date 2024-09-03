package String;

import java.util.Arrays;

public class reverseEvenDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4};
	StringBuffer sb=new StringBuffer();
		for(int i=0;i<a.length;i++)
		{
			if(i%2!=0)
			{
				sb.append(a[i]);
			}
		}
		sb.reverse();
		int ind=0;
		for(int i=0;i<a.length;i++)
		{
			if(i%2!=0)
			{
				a[i]=Character.getNumericValue(sb.charAt(ind++));
			}
		}
		System.out.println(Arrays.toString(a));

	}

}
