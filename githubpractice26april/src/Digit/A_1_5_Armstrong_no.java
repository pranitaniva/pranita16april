package Digit;

import java.util.Scanner;

public class A_1_5_Armstrong_no 
{

public static void main(String[] args) 
{

	Scanner sc=new Scanner(System.in);
		
	int number; //153
	System.out.println(" enter any no");
	number=sc.nextInt();
	int rem;
	int store=0;
	int originalno=number;
	
	while(number>0) 
	{
		rem=number%10;
		store=store+rem*rem*rem;
		number=number/10;
	}
	if(store==originalno) 
	{
		System.out.println("no is armstrong ");
	}
	else 
	{
		System.out.println("no is not armstrong");
	}
}
	
}



/*

153=1*1*1+5*5*5+3*3*3
rem=number%10;   153%10=3 ; rem=number%10; 15%10=5
store=store+rem*rem*rem; store=0+3*3*3=27; store=store+rem*rem*rem; store=27+125=152
number=number/10;  number=153/10=15 number becomes 15 

*/