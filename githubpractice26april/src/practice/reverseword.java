package practice;

public class reverseword 
{
public static void main(String[] args) 
{
	String s="pranita is good girl" ;
    String a[] = s.split(" ");
    for(int i=0;i<a.length;i++)
    {
       for(int j=a[i].length()-1;j>=0;j--) 
       {
           System.out.print(a[i].charAt(j));
       }
       System.out.println();
    }
}
}
