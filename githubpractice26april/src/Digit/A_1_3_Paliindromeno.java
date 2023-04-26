package Digit;

public class A_1_3_Paliindromeno 
{

	public static void main(String[] args) 
	{
		 int number=121;
	       int rem;
	       int store=0;
	       int originalno=number;
	       while(number>0)
	       {
	           rem=number%10;
	           store=store*10+rem;
	           number=number/10;
	       }
	       if(store==originalno)
	       {
	          System.out.println("no is palindrome"); 
	       }
	       else
	       {
	           System.out.println("no is not palindrome");
	       }
	}
}
