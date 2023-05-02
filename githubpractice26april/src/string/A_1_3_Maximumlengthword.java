package string;

public class A_1_3_Maximumlengthword 
{
public static void main(String[] args) 
{
	String s="i love my india";
	String a[]=s.split(" ");
	
	int maxword=0;
	String word=" ";
	for(int i=0;i<a.length;i++) 
	{
		if(a[i].length()>maxword) 
		{
			maxword=a[i].length();
			word=a[i];
		}
	}
System.out.println("length of maximum word = "+maxword);
System.out.println();
System.out.println(word);
}
	
}
