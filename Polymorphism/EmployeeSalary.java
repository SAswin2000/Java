abstract class Employee {
abstract void CalculateSalary();
}
class PermanentEmployee extends Employee
{
float Basic_salary=10000;
float HRAPercent=10;
float DAPercent=20;
float PFPercent=10;
void CalculateSalary()
{
double HRA,DA,PF;
double total;
HRA=((Basic_salary)*(HRAPercent)/100);
DA=((Basic_salary)*(DAPercent)/100);
PF=((Basic_salary)*(PFPercent)/100);
total=((Basic_salary)+(HRA)+(DA)-(PF));
System.out.println("The salary of permanent employee is " + total);
}}
class TemporoaryEmployee extends Employee
{
int HourlyWages = 50;
int HoursWorked = 84;
void CalculateSalary()
{
double total;
total=((HourlyWages)*(HoursWorked));
System.out.println("The salary of temporary employee is " + total);
}}
public class EmployeeSalary {
public static void main(String args[])
{
PermanentEmployee Obj=new PermanentEmployee();
Obj.CalculateSalary();
TemporoaryEmployee Obje=new TemporoaryEmployee();
Obje.CalculateSalary();
}}