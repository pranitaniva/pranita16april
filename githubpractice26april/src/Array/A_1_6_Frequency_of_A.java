package Array;

public class A_1_6_Frequency_of_A 
{

	public static void main(String[] args) 
 
	{
	   String a[]= {"peacock","parrot","anaconda"};
	   
	   char temp='a';
	   int count=0;
	   for(int i=0;i<a.length;i++) 
	   {
		 for(int j=0;j<a[i].length();j++)  
		 {
			 if(temp==a[i].charAt(j)) 
			 {
				 count =count+1;
				 System.out.print(temp+",");
			 }
		 }
	   }
	   System.out.println();
	System.out.print("frequency of a= "+count);
	}

}
