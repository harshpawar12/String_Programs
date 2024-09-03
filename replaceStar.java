package String;

import java.util.Scanner;

public class replaceStar {
	
	replaceStar()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		sc.close();
		System.out.println("Replacing WhiteSpaces in at star");
		System.out.println();
		System.out.println(str.replace(" ", "*"));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		replaceStar r=new replaceStar();

	}

}
