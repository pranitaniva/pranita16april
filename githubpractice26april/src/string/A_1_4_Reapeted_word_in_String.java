package string;

import java.util.TreeSet;

public class A_1_4_Reapeted_word_in_String 
{
public static void main(String[] args) 
{
	String s="mango mango banana banana strawberry tomato";
	
	String a []=s.split(" ");
	
	TreeSet ts=new TreeSet();
	for(int i=0;i<a.length;i++) 
	{
		
		String x = a[i];
		int count=0;
		for(int j=0;j<a.length;j++) 
		{
			if(a[j].equals(x)) 
			{
				count=count+1;
			}
		}
	
		if(count>1) 
		{
			ts.add(x);
			//System.out.println(x);
			
		}
	}
 System.out.println(ts);
}
}
