import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner a = new Scanner(System.in);
            int numb=a.nextInt();
	    for(int i=0;i<numb;i++)
	    {
	    ArrayList<String> lists=new ArrayList<String>();
	    ArrayList<Integer> listn=new ArrayList<Integer>();
	    ArrayList<Integer> listm=new ArrayList<Integer>();
	    int score;
            String name,userName,x,y="";
	    int num=a.nextInt();
            a.nextLine();
            for(int q=0;q<num;q++)
	    {
                userName = a.nextLine();
	        lists.add(userName);
                userName = userName.replaceAll("\\s", "");
	        StringBuffer sb=new StringBuffer(userName);
	        int l=sb.length();
	        score=sb.length();
	        for(int j=0;j<l;j++)
	        {
	            char b=sb.charAt(j);
	            for(int k=(j+1);k<l;k++)
	            {
	                if(b==sb.charAt(k))
	                {
	                 score=(score-1);
	                 l=(l-1);
	                 sb.deleteCharAt(k);
	                }
	            }
	        }
	        listn.add(score);
	    }
	    int min,temp,sz,ax,by,cz,d=0;
	    int max=listn.get(0); 
            d=listn.size();
	    for(int m=1;m<d;m++)
	    {
	        temp=listn.get(m);
	      if(max<temp)
	      {
	          max=temp;
	      }
	    }
	    for(int n=0;n<(listn.size());n++)
	    {
	        temp=listn.get(n);
	        if(max==temp)
	      {
	          listm.add(n);
	      }
	    }
	    sz=listm.size();
	    if(sz==1)
	    {
	   ax=listm.get(0);
	   name=lists.get(ax);
	   System.out.println("The choice is " + name);
	    }
	    else 
	    {
	    by=listm.size();
	    cz=listm.get(0);
	    x=lists.get(cz);
	    for(int o=1;o<by;o++)
	    {
	     y=lists.get(o);
             first:    
            for(int p=0;p<(x.length());p++)
	     {
	         if(x.charAt(p)==y.charAt(p))
	         {
	             continue;
	         }
	         else if((x.charAt(p))>(y.charAt(p)))
	         {
	           x=y;
                   break first;
	         }
                else if((x.charAt(p))<(y.charAt(p)))
	         {
                   break first;
	         }
             }
	    
	    }
	    System.out.println("The choice is " + x);
	    }
	    } 
	}
}
