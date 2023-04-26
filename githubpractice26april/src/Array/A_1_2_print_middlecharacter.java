package Array;

public class A_1_2_print_middlecharacter 
{
public static void main(String[] args) 
{
	String a[]= {"pranita","nivant","yaldarkar"};
	int length=0;
	
	for(int i=0;i<a.length;i++) 
	{
		length=(a[i].length())/2;
		System.out.println(a[i].charAt(length));
	}
	
}
}
