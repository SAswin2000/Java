import java.util.Scanner;
class Bank
{
float rate_of_interest;
void getRateOfInterest()
{
System.out.println("Enter the rate of interest");
}
}
class SBI extends Bank
{
Scanner sc=new Scanner(System.in);
float rate_of_interest;
void getRateOfInterest()
{
System.out.println("Enter the rate of interest");
rate_of_interest=sc.nextFloat();
}
}
class ICICI extends Bank
{
Scanner sc=new Scanner(System.in);
float rate_of_interest;
void getRateOfInterest()
{
System.out.println("Enter the rate of interest");
rate_of_interest=sc.nextFloat();
}
}
class AXIS extends Bank
{
Scanner sc=new Scanner(System.in);
float rate_of_interest;
void getRateOfInterest()
{
System.out.println("Enter the rate of interest");
rate_of_interest=sc.nextFloat();
}
}
public class BankInterest
{
public static void main(String args[])
{
SBI bank1=new SBI();
bank1.getRateOfInterest();
ICICI bank2=new ICICI();
bank2.getRateOfInterest();
AXIS bank3=new AXIS();
bank3.getRateOfInterest();
}
}