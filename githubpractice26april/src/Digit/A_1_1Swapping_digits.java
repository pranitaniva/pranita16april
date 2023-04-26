package Digit;

public class A_1_1Swapping_digits 
{
public static void main(String[] args) 
{
	int a=10;
	int b=20;
	System.out.println("before swpping a= "+a);
	System.out.println("before swpping b= "+b);
	
	int x=a+b;
	a=x-a;
	b=x-b;
	System.out.println("after swapping a= "+a);
	System.out.println("after swapping b= "+b);
	
}
}
