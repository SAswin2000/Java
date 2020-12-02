import java.util.*;
public class Lettera
{
	public static void main(String[] args) 
	{
	int count=0,x;
	char b,y;
	    Scanner ab = new Scanner(System.in);
	        System.out.println("Enter the stirng");
            String str=ab.next();
			int num=str.length();
			char a=str.charAt(0);
			ArrayList<Character> lists=new ArrayList<Character>();
	    ArrayList<Integer> listn=new ArrayList<Integer>();
	    for(int i=0;i<num;i++)
	    {
		  b=str.charAt(i);
		  if(b==a)
		  {
		   count++;
		   }
		   else if(b!=a)
		   {
		    lists.add(a);
			listn.add(count);
			count=1;
		   a=b;
		   }
		}
                lists.add(a);
                listn.add(count);
		int s1=lists.size();
		for(int i=0;i<s1;i++)
		{
		y=lists.get(i);
		x=listn.get(i);
		System.out.print(y);
                System.out.print(x);
		}
	     
	}
}
	    