package String;

public class substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="racecar";
		int max=Integer.MIN_VALUE;
		String temp="";
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				StringBuffer sb=new StringBuffer(s.substring(i, j));
				sb.reverse();
				if(sb.toString().equals(s.substring(i, j)))
				{
					if(s.charAt(j)!=1)
					{
						if(sb.length()>max)
						{
							max=sb.length();
							temp=s.subSequence(i, j)+"";
					
						}
					}
				}
			}
		}
		System.out.println(temp);

	}

}
