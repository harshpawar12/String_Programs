package String;

import java.util.Arrays;
import java.util.Scanner;

public class toCharArraymethod {
	
	void StringArray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the elelmnt in String:");
		String str=sc.next();
		
		char ch[]=str.toCharArray();
		System.out.println("Converting String into Array:");
	/*	for(int i=0;i<ch.length;i++)
		{
			
		}
		*/
		System.out.print(Arrays.toString(ch));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		toCharArraymethod t=new toCharArraymethod();
		t.StringArray();

	}

}
