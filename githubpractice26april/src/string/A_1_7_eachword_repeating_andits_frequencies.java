package string;

import java.util.HashMap;

public class A_1_7_eachword_repeating_andits_frequencies 
{

	public static void main(String[] args) 
	{
		String s="aspire institute pune";
		char[] a=s.toCharArray();
		
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		
		for(char temp:a) 
		{
		
			if(hm.get(temp)==null)
			{
				hm.put(temp, 1);
			}
			else 
			{
				hm.put(temp, hm.get(temp)+1);
			}
		}
	
		hm.forEach((key, value)->
		{
			System.out.println(key+"="+value);
		});
	
	}
	
}
