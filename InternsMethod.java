package String;

public class InternsMethod {
	InternsMethod()
	{
		String s1="java";
		String s2=new String("java");
		String s3=s1.intern();
		String s4=new String("java");

		System.out.println(s1==s2);//false
		System.out.println(s1==s3);//true
		System.out.println(s2==s3);//false
		System.out.println(s2==s4);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InternsMethod i=new InternsMethod();

	}

}
