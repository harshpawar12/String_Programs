package StringBuilder;

import java.util.Scanner;

public class StringBuilderDemo {
	StringBuilderDemo()
	{
		System.out.println("Enetr the String:");
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder(sc.nextLine());
		System.out.println(sb);
		System.out.println("insert method");
		sb.insert(0,"i");
		System.out.println(sb);
		System.out.println("Replace method");
		sb.replace(sb.length(), sb.length(),"python");
		System.out.println(sb);
		System.out.println("Reverse method");
		System.out.println(sb.reverse());
		System.out.println("first index of:");
		System.out.println(sb.indexOf("j"));
		System.out.println("last index of:");
		System.out.println(sb.lastIndexOf("j"));
		sb.delete(1, 4);
		
		System.out.println(sb);
		
	}
	public static void main(String[] args) {
		StringBuilderDemo b=new StringBuilderDemo();
		
	}

}
