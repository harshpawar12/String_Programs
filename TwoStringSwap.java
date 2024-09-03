package String;

public class TwoStringSwap {
	
	TwoStringSwap()
	{
		String str1="java";
		String str2="html";
		System.out.println("String 1:"+str1);
		System.out.println("String 2:"+str2);
		str1=str1.concat(str2);
		int l=str2.length();
		str1=str1.substring(l);
		System.out.println(str1);
		str1=str1.substring(l);
		System.out.println(str1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoStringSwap t=new TwoStringSwap();

	}

}
