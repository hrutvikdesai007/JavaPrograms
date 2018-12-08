import java.util.*;
class anagram
{
	public static void main(String[] args) 
	{
		int i,j,count=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter original String: ");
		String s1= s.next();
		String s3,s4;
		System.out.println("Enter string to be tested for Anagram:");
		String s2= s.next();

		if (s1.length()!=s2.length())
		{
			System.out.println("Entered string is not an Anagram");			
		}
		else
		{	
			s3=s1.toLowerCase();
			s4=s2.toLowerCase();
			for (i=0; i<s1.length() ; i++ )
			{
				for (j=0; j<s1.length(); j++ )
				{
					if (s3.charAt(i)==s4.charAt(j))
					{
						count++;					
					}					
				}
				
			}
		}
		if (count==s1.length())
		{
			System.out.println("Given string is an Anagram String");				
		}
		else
			System.out.println("Not an Anagram String");
	}
}