import java.util.*;
class Func
{
	    int function(String h)
	    {
	    int ab,i,m=0;
	    int len=h.length();
	    if(len==1)
	    {
	       i=Integer.parseInt(h);   
	        if(i%2==0)
	        {
	          m=2;
	         return m;    
	        }
	        else if(i%2!=0)
	        {
	         m=1;
	         return m;     
	        }
	    }
	    else if(len>1)
	    {
              int count=0;
	    one :  for(int j=0;j<len;j++)
	        {
	            char temp=h.charAt(j);
	            int n=Integer.parseInt(String.valueOf(temp));
	            if(n%2==0)
	            {
	                count=(count+1);
	            }
	            else if (n%2!=0)
	            {
	                break one;  
	            }         
	        }
	        if(count==len)
	        {
	            m=2;
	            return m;
	        }
	        else if(count!=len)
	        {
	            m=1;
	            return m;
	        }
	    }
            return 0;
	    }
        int increment(String d)
        {
            int test=0,counta=0;
            int x=Integer.parseInt(d);
                do{
                  x=++x;
                counta=(counta+1);
                test=function(Integer.toString(x));
                }while(test==1);
                return counta;
        }
        int decrement(String e)
        {
           int test=0,countb=0;
            int y=Integer.parseInt(e);
             do
               { 
                y=--y;
                countb=(countb+1);
                test=function(Integer.toString(y));
                }while(test==1); 
              return countb;
        }
	    }
public class Testing
{
    public static void main(String[] args) 
	{
	    int a,b,c,d,j;
	    Func obj=new Func();
	    Scanner ab = new Scanner(System.in);
	    b=ab.nextInt();	    
	    for(int i=0;i<b;i++)
	    {
               String s=ab.next();
	       a=obj.function(s);
	    if(a==2)
	    { 
               j=(i+1);
	         System.out.println("Case #" + j + ": 0 ");
	    }
	    else if (a==1)
	    {
	        String s1 = new String(s);
	        String s2 = new String(s);
	        c=obj.increment(s1);
	        d=obj.decrement(s2);
	     if(c==d)
	     {
               j=(i+1);
	      System.out.println("Case #" + j + ":  " + c);   
	     }
	     else if(c>d)
	     {
               j=(i+1);
	      System.out.println("Case #" + j + ":  " + d);   
	     }
	     else if(c<d)
	     {
              j=(i+1);
	      System.out.println("Case #" + j + ":  " + c);   
	     }
	    }
	    }
	    
	}    
}
