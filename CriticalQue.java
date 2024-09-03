package StringPractice;

import java.util.Scanner;

/*
 * Given a sentence as a string S. Calculate difficulty of 
 * a given sentence.
Difficulty of sentence is defined as 
5*(number of hard words) + 3*(number of easy words). A
word in the given string is considered hard if it has 
4 consecutive consonants or the number of
consonants is more than the number of vowels. 
Else the word is easy.
Note: uppercase and lowercase characters are the same.
Example
Input:
S = "Difficulty of sentence"
Output:
13
Explanation:
2 hard words + 1 easy word
Example
Input:
S = "I am good"
Output:
9
Explanation:
3 easy word
 */
public class CriticalQue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the String:");
		String str=sc.nextLine();
		str=str.toLowerCase();
		String s1[]=str.split(" ");
		int l=0,m=0;
		for(int i=0;i<s1.length;i++)
		{
			int c=0,k=0;
			for(int j=0;j<s1[i].length();j++)
			{
				if(s1[i].charAt(j)=='a'||s1[i].charAt(j)=='e'||
						s1[i].charAt(j)=='o'||s1[i].charAt(j)=='i'||
								s1[i].charAt(j)=='u')
				{
					c++; //small

				}
				else
				{
					k++; //big

				}
			}
			if(k>c)//big>small
			{
				l++;
				
			}
			else
			{
				m++;
			}
		}
			System.out.println((5*l)+(3*m));
			//formula:
		//5*(number of hard words) + 3*(number of easy words)

	}

}
