package Array;

public class A_1_5_Nonrepeatedword 
{
public static void main(String[] args) 
{
	String a[]={"mango","tomato","mango","chocos","tomato","pizza"};
    
    for(int i=0;i<a.length;i++)
    {
        String x=a[i];
        int count=0;
       for(int j=0;j<a.length;j++)
       {
           if(a[j]==x)
           {
               count=count+1;
           }
       }
   
       if(count==1)
      
       {
        System.out.println(x);
      
       }
        
     }
   }
}
