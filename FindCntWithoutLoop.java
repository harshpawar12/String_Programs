package String;

import java.util.Scanner;

public class FindCntWithoutLoop {
	
	void string()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the String:");
		String str=sc.next();
		sc.close();
		System.out.println(str.length());
	}

	public static void main(String[] args) {
		FindCntWithoutLoop f=new FindCntWithoutLoop();
		f.string();

	}

}
