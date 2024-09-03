package String;

import java.util.Arrays;

public class doubleDigitEvenIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4};
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
			{
				a[i]=a[i]*2;
			}
			
		}
		
		System.out.println(Arrays.toString(a));

	}

}
