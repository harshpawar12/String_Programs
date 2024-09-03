package String;

public class substringinanother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello";
		String t="ell";
		StringBuffer sb=new StringBuffer();
		StringBuffer sb1=new StringBuffer();
		for(int i=0;i<s.length();i++)
		{
			sb.append(s.charAt(i));
		}
		for(int i=0;i<t.length();i++)
		{
			sb.append(t.charAt(i));
		}
		if(sb.toString().contains(sb1.toString()))
		{
			System.out.println("content present");
		}
		else
		{
			System.out.println("not present");
		}
		
//		if(s.contains(t))
//		{
//			System.out.println("present");
//		}
//		else
//		{
//			System.out.println("not present");
//		}

	}

}
