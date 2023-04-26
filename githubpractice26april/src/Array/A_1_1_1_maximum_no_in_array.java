package Array;

public class A_1_1_1_maximum_no_in_array 
{
public static void main(String[] args)
{
	int a[]= {10,15,20,25,48,100,52,47,87,400};
	
	int maxdigit=a[0];
	for(int i=0;i<a.length;i++) 
	{
		
		if(a[i]>maxdigit) 
		{
			maxdigit=a[i];
		}
	}
System.out.println(maxdigit);
}
}
