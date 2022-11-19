
public class CountOfCharacters {

	public static void main(String[] args) {
		String s="Hi Good Morning! This is Lavanya";
		int vowels=0;
		int consonants=0;
		int specialChar=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'
					||s.charAt(i)=='U'||s.charAt(i)=='a'||s.charAt(i)=='e'||
					s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				vowels++;
			}
			else if(s.charAt(i)=='!'||s.charAt(i)=='@'||s.charAt(i)=='#'||s.charAt(i)=='$'
				||s.charAt(i)=='%'||s.charAt(i)=='^'||s.charAt(i)=='&'||s.charAt(i)=='*')
			{
				specialChar++;
			}
			else if(s.charAt(i)!=' ')
			{
				consonants++;
			}
		}
		System.out.println("No of vowels present in string is "+vowels);
		System.out.println("No of consonants present in string is "+consonants);
		System.out.println("No of special characters present in string is "+specialChar);
	}
}
