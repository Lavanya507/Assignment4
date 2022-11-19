
public class UniqueCharacters {

	public static void main(String[] args) {
		String s="Hi world";
		boolean flag=false;
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					flag=true;
				}
			}
		}
		if(flag==true)
		{
			System.out.println("The string contains duplicate characters");
		}
		else
		{
			System.out.println("The string contains all unique characters");
		}
	}
}

