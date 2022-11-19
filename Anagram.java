import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1="Eat";
		String s2="Ate";
		String str1="";
		String str2="";
		char temp=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='A'&&s1.charAt(i)<='Z'&&s1.charAt(i)!=' ')
			{
				str1=str1+(char)(s1.charAt(i)+32);
			}
			else if(s1.charAt(i)>='a'&&s1.charAt(i)<='z')
			{
				str1=str1+s1.charAt(i);
			}
		}
		for(int j=0;j<s2.length();j++)
		{
			if(s2.charAt(j)>='A'&&s2.charAt(j)<='Z'&&s2.charAt(j)!=' ')
			{
				str2=str2+(char)(s2.charAt(j)+32);
			}
			else if(s2.charAt(j)>='a'&&s2.charAt(j)<='z')
			{
				str2=str2+s2.charAt(j);
			}
		}
		char[] ch1=str1.toCharArray();
		char[] ch2=str2.toCharArray();
		for(int i=0;i<ch1.length;i++)
		{
			for(int j=i+1;j<ch1.length;j++)
			{
				if(ch1[i]>ch1[j])
				{
					temp=ch1[i];
					ch1[i]=ch1[j];
					ch1[j]=temp;
				}
			}
		}
		for(int i=0;i<ch2.length;i++)
		{
			for(int j=i+1;j<ch2.length;j++)
			{
				if(ch2[i]>ch2[j])
				{
					temp=ch2[i];
					ch2[i]=ch2[j];
					ch2[j]=temp;
				}
			}
		}
		if(Arrays.equals(ch1, ch2))
		{
			System.out.println("It is Anagaram");
		}
		else
		{
			System.out.println("It is not a Anagram");
		}
	}
}
