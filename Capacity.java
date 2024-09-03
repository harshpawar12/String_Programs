package StringBuffer;

public class Capacity {
	Capacity()
	{
		StringBuffer sb=new StringBuffer("python");
		
		System.out.println("Default Capacity:"+sb.capacity());
		sb.ensureCapacity(26);// (old*1)+1
		System.out.println(""+sb.capacity());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Capacity c=new Capacity();

	}

}
