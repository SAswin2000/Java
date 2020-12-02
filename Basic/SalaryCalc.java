import java.util.Scanner;
import java.io.*;
import java.util.*;
class FoodCorporation
{
Scanner sc= new Scanner(System.in);
String name;
float basic_pay;
int hour_worked;
void getdata()
{
System.out.println("Enter the name of the employee");
name= sc.nextLine();
System.out.println("Enter the basic pay of the employee");
basic_pay=sc.nextFloat();
System.out.println("Enter the no of hours worked of the employee");
hour_worked=sc.nextInt();
}
}
class calculate extends FoodCorporation
{
void cal(float a,int b)
{
if(a<8.0)
{
System.out.println("Error");
}
else if(b>60)
{
System.out.println("Error");
}
else
{
if(b<40)
{
float pay=(float)((a)*(b));
System.out.println("The Salary of the employee is " + pay);
}
else if(b>40)
{
int c=((b)-(40));
float temp=(float)((a)*(40));
float d=(float)((c)*(1.5)*(a));
float e=(float)((d)+(temp));
System.out.println("The Salary of the employee is "+ e);
}
}
}
}
public class SalaryCalc
{
public static void main(String args[])
{
calculate a=new calculate();
calculate b=new calculate();
calculate c=new calculate();
a.getdata();
a.cal(a.basic_pay,a.hour_worked);
b.getdata();
b.cal(b.basic_pay,b.hour_worked);
c.getdata();
c.cal(c.basic_pay,c.hour_worked);
}