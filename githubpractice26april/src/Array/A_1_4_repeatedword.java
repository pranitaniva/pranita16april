package Array;

import java.util.TreeSet;

public class A_1_4_repeatedword 
{
public static void main(String[] args) 
{
	String a[]= {"mango","mango","pizza","pizza","grapes"};
	
	TreeSet ts=new TreeSet();
	for(int i=0;i<a.length;i++) 
	{
		int count=0;
		String x=a[i];
		for(int j=0;j<a.length;j++) 
		{
			if(a[j]==x) 
			{
				count=count+1;
			}
		}
	if(count>1) 
	{
		ts.add(x);
	}
	
	}
System.out.println(ts);

}
}
