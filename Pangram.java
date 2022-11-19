
public class Pangram {

	public static void main(String[] args) {
		String s="The Five Boxing Wizards Jumps Quickly";
		String str1="";
		boolean flag=false;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='A'&&s.charAt(i)<='Z'&&s.charAt(i)!=' ')
			{
				str1=str1+(char)(s.charAt(i)+32);
			}
			else if(s.charAt(i)>='a'&&s.charAt(i)<='z')
			{
				str1=str1+s.charAt(i);
			}
		}
		char[] ch=str1.toCharArray();
		int[] ar=new int[26];
		for(int i=0;i<ch.length;i++)
		{
			int index=ch[i]-97;
			ar[index]++;
		}
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==0)
			{
				flag=true;
			}
		}
		if(flag==false)
		{
			System.out.println("It is a pangram");
		}
		else
		{
			System.out.println("It is not a pangram");
		}
	}
}
