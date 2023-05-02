package string;

public class A_1_1_Reverse_String 
{

	public static void main(String[] args) 
	{
		String s="i love my india";
		String a[]=s.split(" ");
		for(int i=0;i<a.length;i++) 
		{
			String Rev=" ";
			for(int j=0;j<a[i].length();j++) 
			{
				Rev=a[i].charAt(j)+Rev;
			}
		
			System.out.print(Rev);
		}
	}
}
