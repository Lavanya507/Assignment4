
public class MaximumOccuringCharacter {

	public static void main(String[] args) {
		char s[]="Yassaswini".toCharArray();
		int rep[]=new int[256];
		int max=-1;
		char result=0;
		for(int i=0;i<s.length;i++)
		{
			rep[s[i]]++;
		}
		for(int i=0;i<s.length;i++)
		{
			if(max<rep[s[i]])
			{
				max=rep[s[i]];
				result=s[i];
			}
		}
		System.out.println(" "+result);
	}

}
