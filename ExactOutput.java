package String;

import java.util.Scanner;

/*
 * Q3. Extract the integers 
 Input:
 s = "1: Prakhar Agrawal, 2: Manish Kumar Rai,
 3: Rishabh Gupta56"
 Output: 1 2 3 56
 Explanation:
 1, 2, 3, 56 are the integers present in s.
 */
public class ExactOutput {
	ExactOutput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the String:");
		String s1=sc.nextLine();
		
		for(int i=0;i<s1.length()-1;i++)
		{
			if(Character.isDigit(s1.charAt(i)))
			{
				System.out.print(s1.charAt(i)+"");
				 if(Character.isDigit(s1.charAt(i+1)))
				{
					
					System.out.print(s1.charAt(i+1));
				}
				System.out.print(" ");
			}
			
			
			
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExactOutput e=new ExactOutput();
		

	}

}
