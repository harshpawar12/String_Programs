package StringBuffer;

public class commonsequence {
	/*
	 * 2. Write a Java program that accepts
	 *  two strings as input and finds the
	 *   longest common subsequence using
	 *    the StringBuffer class. The longest
	 *     common subsequence is the longest seq
	 *     uence of characters that appears in the sa
	 *     me order in both strings. For example,
	 *      if the input strings are "ABCDGH" and
	 *       "AEDFHR", the output should be "ADH".
	 */
	
	commonsequence()
	{
		StringBuffer sb=new StringBuffer("ABCDGHI");
		StringBuffer sb1=new StringBuffer("DEAFHRI");
		
		for(int i=0;i<sb.length();i++)
		{
			for(int j=0;j<sb1.length();j++)
			{
				if(sb.charAt(i)==sb1.charAt(j))
				{
						System.out.print(sb.charAt(i));
						
				}
			}
		}

	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		commonsequence c=new commonsequence();

	}

}
