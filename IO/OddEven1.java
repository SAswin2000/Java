import java.util.*;
import java.io.*;
public class Oddeven1
{
public  static void main(String args[]) throws IOException
{
File f=new File("program.txt");
		File odd=new File("odd.txt");
		File even=new File("even.txt");
		OutputStream fo=new FileOutputStream(f);
int c;		
char d;
String a;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the numbers and enter q at the end");
do{
d=(char)br.read();
if(d!='q')
{
fo.write(d);
}
}while(d!='q');
d='0';
fo.close();
OutputStream fa=new FileOutputStream(odd);
OutputStream fb=new FileOutputStream(even);
InputStream ef=new FileInputStream(f);
int i=0;
while((i=ef.read())!=-1)
{
d=(char)i;
c=Integer.parseInt(String.valueOf(d));
if(c%2==0)
{
fb.write(d);
}
else if (c%2!=0)
{
fa.write(d);
}
}
fa.close();fb.close();ef.close();
InputStream ab=new FileInputStream(odd);
InputStream cd=new FileInputStream(even);
		System.out.println("Odd numbers in the file odd");
                 
		while((i=cd.read())!=-1){
			System.out.println((char)i+" ");
		}
               System.out.println("Even numbers in the file Even"); 
		while((i=ab.read())!=-1){
			System.out.println((char)i+" ");
		}
		cd.close();ab.close();
	}
}