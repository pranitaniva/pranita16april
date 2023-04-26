package Digit;

public class A_1_2_reverse_the_no 
{
public static void main(String[] args) 
{
	int number=12545879;
	int Remainder;
	int Store=0;
	while(number>0) 
	{
		Remainder=number%10	;
		Store=Store*10+Remainder;
		number=number/10;
	}
	
	System.out.println(Store);
}
}
