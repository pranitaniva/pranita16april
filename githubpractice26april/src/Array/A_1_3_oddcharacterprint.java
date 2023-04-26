package Array;

public class A_1_3_oddcharacterprint 
{
	public static void main(String[] args) 
	{

		String a[]= {"pranita","nivant","yaldarkar"};
		
		for(int i=0;i<a.length;i++) 
		{
			for(int j=1;j<a[i].length();j=j+2) 
			{
				System.out.print(a[i].charAt(j));
			}
			System.out.println();
		}
	}
}
