package String;

public class Apple {
	/*
	 * String s[]= {"ale","apple","monkey","plea"};
		String s1="abpcplea";
		
		find the maximum common element
		output:apple.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[]= {"ale","apple","monkey","plea"};
		String s1="abpcplea";
		StringBuilder max=new StringBuilder();
		for(int i=0;i<s.length;i++)
		{
			StringBuilder sb=new StringBuilder();
			for(int j=0;j<s[i].length();j++)
			{
				for(int k=0;k<s1.length();k++)
				{
					if(s[i].charAt(j)==s1.charAt(k))
					{
						sb.append(s1.charAt(k));
						break;
					}
				}
			}
			if(sb.length()>max.length())
			{
				max=sb;
			}
			
		}
		System.out.println(max);
		

	}

}
