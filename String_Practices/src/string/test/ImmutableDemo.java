package string.test;

public class ImmutableDemo 
{

	public static void main(String[] args) 
	{
		
		occurence();
	}
	
	static void occurence()
	{
		String str="aaaaaaabbbccccaaaaa";
		String str1[]=str.split("");
		for(String x:str1)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		String s="";
		for(int i=0;i<str1.length;i++)
		{
			int c=0;
			if(!s.contains(str1[i]))
			{
				for(int j=0;j<str1.length;j++)
				{
					if(str1[i].equals(str1[j]))
					{
						c++;
						s=s+str1[i];
					}
				}
				System.out.println(str1[i]+" is repeated "+c);
			}
		}
	}
}

