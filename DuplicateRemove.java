package StringBuffer;

public class DuplicateRemove {
	/*
	 * 1.Write a Java program that accepts 
	 * a string as input and removes all 
	 * duplicate characters using the StringBuffer
	 *  class. For example, if the input string
	 *   is "aabbccdd", the output should be
	 *    "abcd".1.Write a Java program 
	 *    that accepts a string as input and
	 *     removes all duplicate characters using
	 *the StringBuffer class. For example, 
	 *if the input string is "aabbccdd", the 
	 *output should be "abcd".
	 */
	
	DuplicateRemove()
	{
		StringBuffer sb=new StringBuffer("aabbccsdda");
		
		for(int i=0;i<sb.length();i++)
		{
			for(int j=i+1;j<sb.length();j++)
			{
				if(sb.charAt(i)==sb.charAt(j))
				{
				sb.deleteCharAt(j);
				j--;
				}
			}
		}
		System.out.println(sb);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuplicateRemove r=new DuplicateRemove();

	}

}
