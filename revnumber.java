package String;

import java.util.Arrays;

public class revnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="1234";
		char[] a= str.toCharArray();
		int b[]=new int[a.length];
		int x=0;
		String temp="";
		for(int i=0;i<a.length;i++)
		{
			if(i%2!=0)
			{
			temp+=a[i];
			}
		}
		x=temp.length()-1;
		for(int i=0;i<a.length;i++)
		{
			if(i%2!=0)
			{
				a[i]=temp.charAt(x--);
			}
		}
		temp=new String();
		System.out.println(a);

	}

}
