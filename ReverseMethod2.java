package String;

public class ReverseMethod2 {
	public static void Alphabet(String str)
	{
		StringBuffer sb=new StringBuffer(str);
		StringBuffer s=new StringBuffer();
		for(int i=0;i<s.length();i++)
		{
			if(Character.isAlphabetic(s.charAt(i)))
			{
				s.append(str.charAt(i));
			}
		}
		s.reverse();
		
		int j=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(Character.isAlphabetic(s.charAt(i)))
			{
				s.setCharAt(i,s.charAt(j));
				j++;
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="A$b#b*";
		
		ReverseMethod2.Alphabet(str);
	}

}
