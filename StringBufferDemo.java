package StringBuffer;

import java.util.Scanner;

public class StringBufferDemo {
	StringBufferDemo()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enetr the String:");
	StringBuffer sb=new StringBuffer(sc.next());//1 method
	System.out.println("First String:"+sb);
	StringBuffer sb1=new StringBuffer("java programming");//2 method
	System.out.println("String second:"+sb1);
	String str="welcome";
	StringBuffer sb2=new StringBuffer(str);//3 method
	System.out.println("Third String:"+sb2);
	sb2.reverse();// String reversed.
	System.out.println("Reverse method:"+sb2);
	System.out.println("-------------------------------");
	String str3="codenara";
	StringBuffer sb4=new StringBuffer(str3);
	
	sb4.append(str); //String append.
	System.out.println("append method:"+sb4);
	System.out.println("-------------insert method------------------");

	//insert method.
	String s6="Python";
	StringBuffer sb5=new StringBuffer(s6);
	sb5.insert(0,"Hi");
	
	System.out.println("Insert the 0 index:"+sb5);
	System.out.println("-------------Delete method------------------");
	sb5.deleteCharAt(0);// one index deleted.
	System.out.println("Deletd index ele:"+sb5);
	sb5.delete(0, 2);// multiple indexes deleted.
	System.out.println("delete multile indexex:"+sb5);
	System.out.println("------------------");
	
	System.out.println("length count:"+sb5.length());
	String s7="html";
	StringBuffer sb6=new StringBuffer(s7);
	sb6.replace(0, 1, s7);
	System.out.println(sb6);
	
	System.out.println("-----------lastindex & lastindexof-------------");
	Scanner scc=new Scanner(System.in);
	System.out.println("Enter the StringLine");
	StringBuffer sb8=new StringBuffer(scc.nextLine());
	System.out.println("first index occurence:"+sb8.indexOf("j"));
	System.out.println("last index occurence"+sb8.lastIndexOf("j"));
	System.out.println("------Empty String------------");
	String e="";
	System.out.println(e.isEmpty());
	System.out.println("------SubString method--------");
	String e1="Empire";
	
	System.out.println("subString:"+e1.substring(1,3));
	System.out.println("------------------");
	

	sb8.replace(0, 0, "harsha");
	System.out.println(sb8);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBufferDemo b=new StringBufferDemo();
		/*
		 * indexOf("Java"): Returns the index within this string of the first occurrence of thespecified substring  
lastindexOf("Java"):Returns the index within this string of the last occurrence of thespecified substring.
insert():
delete():
deleteCharAt():
reverse():
length():
setCharAt():
substring():
replace():
isEmpty():

equals():

compareTo():
		 */
	}

}
