import java.util.*;
public class Letterb
{
	public static void main(String[] args) 
	{
	    Scanner a = new Scanner(System.in);
           String username = a.nextLine();
           int l=username.length();
           StringBuffer sb=new StringBuffer(username);
            int ab=0;
           for(int j=0;j<l;)
	        {
	            char b=sb.charAt(j);
	            for(int k=0;k<l;)
	            {
	                if(b==sb.charAt(k))
	                {
	                 ab++;
	                 l=(l-1);
	                 sb.deleteCharAt(k);
	                }
                       else
                     {
                      k=(k+1);
                     }     
	            }
                  System.out.print(b);
                  System.out.print(ab);
                  ab=0;
	        }
}
}