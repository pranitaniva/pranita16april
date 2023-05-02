package practice;

import java.util.HashMap;

public class Frequency_of_each_word_in_string 
{

	public static void main(String[] args) 
	{
		String s=" Peoples are very selfish nowdays";
		
		 s=s.toLowerCase();
		 
		  char[]a= s.toCharArray();
		  
		  HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		  
		  for(char temp:a) 
		  {
			  if(hm.get(temp)==null) 
			  {
				  hm.put(temp, 1);
			  }
			  
			  else
			  {
				hm.put(temp, hm.get(temp)+1) ; 
			  }
		  }
		
		  hm.forEach((key,value)->
		  {
			 System.out.println(key+"="+value); 
		  });
	}
}
