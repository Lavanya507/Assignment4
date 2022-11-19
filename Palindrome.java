
public class Palindrome {

	public static void main(String[] args) {
		String s="2552";
		String str="";
		for(int i=s.length()-1;i>=0;i--)
		{
			str=str+s.charAt(i);
		}
		if(s.equals(str))
		{
			System.out.println("2552 is palindrome");
		}
		else
		{
			System.out.println("2552 is not a palindrome");
		}
	}
}
