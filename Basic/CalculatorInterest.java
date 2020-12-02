class Calculator
{
int p,n,r,t;
}
class SimpleInterest extends Calculator
{
void calculatesimple()
{
float result;
result=(((p)*(n)*(r))/100);
System.out.println("The simple interest is "+result);
}}
class CompoundInterest extends SimpleInterest
{
void calculatecompound()
{
double comp_int = p*(Math.pow(((1.0) + ((r)*(t)) / 100),n));
System.out.println("The compound interest is "+comp_int);
}}
class Final_Value extends CompoundInterest
{
void calculatefinal()
{
int temp=((p)*(t));
int temp2=((1)+r);
int V=((temp)*(temp2));
System.out.println("The final value is "+ V);
}}
public class CalculatorInterest
{
public static void main(String args[])
{
Final_Value a=new Final_Value();
a.p=Integer.parseInt(args[0]);
a.n=Integer.parseInt(args[1]);
a.r=Integer.parseInt(args[2]);
a.t=Integer.parseInt(args[3]);
a.calculatesimple();
a.calculatecompound();
a.calculatefinal();
}
}