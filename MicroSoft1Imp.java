package String;

import java.util.Scanner;

public class MicroSoft1Imp {
	/*
	 * Q8. Front-Back Transformation- copy (Microsoft)
 Input: S = "Hello"
 Output: Svool
 Explanation: 'H' is the 8th letter from the
 beginning of alphabets, which is replaced by
 'S' which comes at 8th position in reverse order
 of alphabets. Similarly, all other letters are
 replaced by their respective upper or lower case
 letters accordingly.

	start=65
	end=90

	 */
	MicroSoft1Imp()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.next();
		
		char startCap=65;
		char Endcap=90;
		for(int i=0;i<str.length();i++)
		{
			if(Character.isUpperCase(str.charAt(i)))
			{
			int currentcap=str.charAt(i);
			int diff=currentcap-startCap;
			int output=Endcap-diff;
			System.out.println((char)output);
			}
		}
		char smallCap=97;
		char Ecap=122;
		for(int i=0;i<str.length();i++)
		{
			if(Character.isLowerCase(str.charAt(i)))
			{
				int current=str.charAt(i);
				int diff=current-smallCap;
				int output=Ecap-diff;
				System.out.println((char)output);
			}
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MicroSoft1Imp m=new MicroSoft1Imp();

	}

}
