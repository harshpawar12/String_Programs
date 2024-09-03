package StringBuilder;

public class StringRotation {
	StringRotation()
	{
		String  str=new String("abcd");
		String str1=new String("cdab");

		
		
		str=str+str;
		System.out.println(str);
		System.out.println(str.contains(str1)?"true":"false");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringRotation s=new StringRotation();

	}

}
