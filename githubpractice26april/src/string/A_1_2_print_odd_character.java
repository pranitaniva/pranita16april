package string;

public class A_1_2_print_odd_character 
{
public static void main(String[] args) 
{
	String s="i love my india";
	String a[]=s.split(" ");
	
	for(int i=0;i<a.length;i++) 
	{
		for(int j=1;j<a[i].length();j=j+2) 
		{
			System.out.print(a[i].charAt(j)+", ");
		}
	
	}
}
}
