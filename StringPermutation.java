package StringMostImp;

public class StringPermutation {
	
	public static void ispermutation(String s,String per)
	{
		if(s.length()==0)
		{
			System.out.println(per);
			
		}
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			
			String newstr=s.substring(0, i)+s.substring(i+1);
			ispermutation(newstr,per+ch);
		}
	}

	public static void main(String[] args) {
		
		String s="java";
		ispermutation(s, "");
		
		
		
		

	}

}
