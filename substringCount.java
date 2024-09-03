package String;

public class substringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aaa";
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				sb.append((s.subSequence(i, j)));
				System.out.println(sb);
			}
		}
		

	}

}
