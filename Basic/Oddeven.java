import java.util.Scanner;
class OddAndEven
{
int countOfOdd=0;
int countOfEven=0;;
void addNumber(int a)
{
if((a%2)==0)
{
countOfEven++;
}
else
{
countOfOdd++;
}}
void ToString()
{
System.out.println("Number of Odd " + countOfOdd);
System.out.println("Number of Even " + countOfEven);
}}
class TestOddAndEven
{
OddAndEven a=new OddAndEven();
Scanner sc=new Scanner(System.in);
char ch;
void calc()
{
do{
System.out.println("Enter the number");
int x=sc.nextInt();
a.addNumber(x);
System.out.println("If you want to exit press Q");
ch = sc.next().charAt(0);
} while(ch !='Q');
a.ToString();
}}
public class Oddeven
{
public static void main(String args[])
{
TestOddAndEven ab=new TestOddAndEven();
ab.calc();
}}