package practice;

public class prime_no 
{
public static void main(String[] args) 
{
	int a[]= {11,25,41,7,53,58,51};
	
	System.out.print("print all prime no");
	for(int i=0;i<a.length;i++) 
	{
		boolean temp = true;
		for(int j=2;j<a[i]-1;j++) 
		{
			if(a[i]%j==0) 
			{
				temp=false;
			}
		}
		if(temp==true)
		{
			System.out.print(a[i]+",");
		}
	}
}
}
