package Array;

public class A_1_1_maximum_word_in_array 
{
public static void main(String[] args) 
{
	String s[]= {"pranita","nivant","yaldarkar"};

	int maxword=0;
	String xx=" ";
	for(int i=0;i<s.length;i++) 
	{
		if(s[i].length()>maxword) 
		{
			maxword=s[i].length();
			xx=s[i];
		}
	}
System.out.println(xx);
}
	
}
