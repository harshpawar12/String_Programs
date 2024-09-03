package String;

public class factorialOfPrimeDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4};
		System.out.println("factorial of prime number:");
		for(int i=0;i<a.length;i++)
		{
			int c=1;
			for(int j=1;j<a[i];j++)
			{
				if(a[i]%j==0)
				{
					c++;
				}
			}
			
			if(c==2)
			{
				int fact=1;
				for(int k=a[i];k>1;k--)
				{
					fact=fact*k;
					
					
				}
				System.out.println(fact);

				
				
				
			}
			
		}
		

	}

}
