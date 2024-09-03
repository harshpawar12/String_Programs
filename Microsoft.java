package String;

public class Microsoft {
	/*
	 * String s[]= {"ale","apple","monkey","plea"};
		String s1="abpcplea";
		
		find the maximum common element
		output:apple.
	 */
	Microsoft()
	{
		String s[]= {"ale","monkey","plea"};
		String s1="abpcplea";
		StringBuffer max=new StringBuffer();
		for(int i=0;i<s.length;i++)
		{
			StringBuffer sb=new StringBuffer();
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Microsoft m=new Microsoft();

	}

}
