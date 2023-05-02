package Array;

import java.util.HashMap;

public class A_1_7_frequency 
{

	public static void main(String[] args) 
	{
		 String a[]= {"peacock","parrot","anaconda"};
		 
		 HashMap<Integer, Character> hm=new HashMap<Integer,Character>();
		 
		 for(int i=0;i<a.length;i++) 
		 {
			 for(int j=0;j<a[i].length();j++) 
			 {
				 if(i==0) 
				 {
					 hm.put(1, a[i].charAt(j));
					 
				 }
				 else if(hm.containsKey(a[i].charAt(j)))
				 {
					 hm.put((int) a[i].charAt(j), hm.get(a[i].charAt(j)+1));
				 }
				 
				 else
				 {
					hm.put(1, a[i].charAt(j));
				 }
				 System.out.println(hm);
			 }
		 System.out.println();
		 }
		
	}
}
