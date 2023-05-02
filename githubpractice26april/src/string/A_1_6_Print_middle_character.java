package string;

public class A_1_6_Print_middle_character 
{

	public static void main(String[] args) 
	{
		String s="mango mango banana banana strawberry tomato";
		
		String a []=s.split(" ");
		
	   
		for(int i=0;i<a.length;i++) 
		{
			int  mid ;
			for(int j=0;j<a[i].length();j++) 
			{
				mid=(a[i].length())/2;
				System.out.print(a[i].charAt(mid)+",");
				break;
			}
		}
	}
}
