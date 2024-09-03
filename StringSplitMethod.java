package String;

import java.util.Arrays;
import java.util.Scanner;

public class StringSplitMethod {
	
	void arr()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the String:");
		String str=sc.nextLine();
		
		String s[]=str.split("j");
		
	
		
		
		
		System.out.println("the splited array is:");
		System.out.println(Arrays.toString(s));
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringSplitMethod s=new StringSplitMethod();
		s.arr();

	}

}
