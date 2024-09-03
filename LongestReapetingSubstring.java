package String;

public class LongestReapetingSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="banana";
		//output 'ana'---longest substring twiceRepeted
		int max=Integer.MIN_VALUE;
		String temp="";
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					
					StringBuffer sb=new StringBuffer(s.substring(i, j));
					System.out.print(sb.charAt(0));
					break;
					
				}
			}
		}
	}

}
