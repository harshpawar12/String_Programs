package StringBuffer;

import java.util.Scanner;

public class HardQue {
	
	HardQue()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		StringBuffer sb=new StringBuffer(sc.next());
		int x=0,y=0;
		for(int i=0;i<sb.length();i++)
		{
			int c=1;
			for(int j=i+1;j<sb.length();j++)
			{
				if(sb.charAt(i)==sb.charAt(j))
				{
					c++;
					sb.deleteCharAt(j);
					j--;
				}
			}
			if(sb.charAt(i)%2==0 && c%2==0)
			{
				x++;
			}
			if(sb.charAt(i)%2!=0 && c%2!=0)
			{
				y++;
			}
		}
		if((x+y)%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("ODD");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub(
		HardQue h=new HardQue();

	}

}
