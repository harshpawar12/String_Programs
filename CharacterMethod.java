package String;

public class CharacterMethod {
	
	CharacterMethod()
	{
		char ch='H';
		char ch1='a';
		
		System.out.println(Character.isUpperCase(ch));
		System.out.println(Character.isLowerCase(ch));
		System.out.println(Character.toUpperCase(ch));
		System.out.println(Character.toLowerCase(ch));
		System.out.println(Character.isDigit(ch));
		System.out.println(Character.isDigit('8'));
		System.out.println(Character.isWhitespace(' '));
		System.out.println(Character.isWhitespace(ch));
		System.out.println(Character.isAlphabetic('R'));
		System.out.println(Character.isLetter('Y'));
		int n=Character.getNumericValue(ch1);
	}
/*
 * true
false
H
h
false
true
true
false
true
true
 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CharacterMethod c=new CharacterMethod();

	}

}
