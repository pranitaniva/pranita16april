package Digit;

import java.util.Scanner;

public class A_1_4_prime_no 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter starting no");
		int start = sc.nextInt();
		
		System.out.println("enter end no");
		int end = sc.nextInt();
		
		for(int i=start;i<=end;i++) 
		{
			boolean temp=true;
			for(int j=2;j<i-1;j++) 
			{
				if(i%j==0) 
				{
					temp=false;
				}
			}
		
			if(temp==true) 
			{
				System.out.println(i);
			}
		}
		
	}
	
}
