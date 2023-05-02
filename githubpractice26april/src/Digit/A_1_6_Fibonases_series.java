package Digit;

public class A_1_6_Fibonases_series 
{
//0,1,2,3,5,8
public static void main(String[] args) 
{
	int number=8;
	int firstno=0;
	int secondno=1;
	
	System.out.print("fibonacci sereie  = ");
	for(int i=1;i<=number;i++) 
	{
		
		System.out.print(" , "+firstno);
		int nextno = firstno+secondno; //0+1=1
	    firstno = secondno;
	    secondno=nextno;
	    
	}


}
}
