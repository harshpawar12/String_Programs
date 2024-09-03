package String;

public class Svool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="HELLO";

		
		for(int i=0;i<s.length();i++)
		{
			System.out.print(Character.toLowerCase((char)(((int)'Z')-(((int) Character.toUpperCase(s.charAt(i)))-65))));
//			int currentcap=s.charAt(i);
//			int diff=currentcap-firstcar;
//			int output=lastcar-diff;
//			System.out.println((char)output);
		}

	}

}
