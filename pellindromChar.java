package StringBuffer;

import java.util.Scanner;

public class pellindromChar {
	pellindromChar()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		StringBuffer sb=new StringBuffer(sc.next());
		StringBuffer sb1=new StringBuffer("nitin");
		sb.reverse();
		System.out.println("Reverse String::"+sb);
		if(sb.compareTo(sb1)==0)
		{
			System.out.println("pellindrom");
		}
		else
		{
			System.out.println("not pellindrom");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pellindromChar p=new pellindromChar();

	}

}
