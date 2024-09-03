package StringBuilder;

public class appendDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1[]= {"Harsh1","omkar12","Aditya123","Sangram1234"};
		String s="1234";
		String s2="H";
		for(int i=0;i<s1.length;i++)
		{
			StringBuilder sb=new StringBuilder();

			for(int j=0;j<s1[i].length();j++)
			{
				if(Character.isDigit(s1[i].charAt(j)))
				{
					sb.append(s1[i].charAt(j));
					//System.out.println(sb);
					
				}
				if(Character.isUpperCase(s1[i].charAt(j)))
				{
		//			sb.append(s1[i].charAt(j));
				}
			}
			if(sb.toString().equals(s))
			{
				System.out.println(s1[i]);
			}
//			if(sb.toString().equals(s2))
//			{
//				System.out.println(s1[i]+" ");
//			}
		}
	//	System.out.println(sb);
				

	}

}
