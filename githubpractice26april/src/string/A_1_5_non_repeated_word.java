package string;

public class A_1_5_non_repeated_word 
{
public static void main(String[] args) 
{

	String s="mango mango banana banana strawberry tomato";
	
	String a []=s.split(" ");
	
	for(int i=0;i<a.length;i++)
	{
		String x=a[i];
		int count=0;
		
		for(int j=0;j<a.length;j++ ) 
		{
			if(a[j].equals(x)) 
			{
				count=count+1;
			}
		}
	
		if(count==1) 
		{
		
			System.out.println(x);
	
		}
	}
}
}
