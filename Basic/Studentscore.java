import java.util.Scanner;
class Student
{
String name;
float totalScore;
float numberOfQuizzes;
Scanner sc=new Scanner(System.in);
public Student(String name, double score)
{
this.name=name;
score=totalScore;
}
public Student (double score, String name)
{
score=totalScore;
this.name=name;
}
public Student(String name)
{
this.name=name;
}
public String getName()
{
System.out.println("Enter the name of the student");
return(sc.nextLine());
}
public double getAverage()
{
double temp=0;
double tempa=0;
int i=0;
System.out.println("Enter the no of quiz taken");
numberOfQuizzes=sc.nextInt();
for(i=0;i<numberOfQuizzes;i++)
{
temp+=getTotalScore();
addQuiz(temp);
temp=0;
}
System.out.println(totalScore);
tempa=(totalScore/numberOfQuizzes);
return(tempa);
}
public double getTotalScore()
{
System.out.println("Enter the mark of quiz ");
return(sc.nextDouble());
}
public void addQuiz(double score)
{
totalScore+=score;
}
public void printStudent()
{
double tempb;
tempb=getAverage();
System.out.println(" The name of the student is "+ name);
System.out.println("The average mark of the student is "+ tempb);
}
public String toString()
{
return "The total score is " + totalScore + ". The total no of quizzes are " + num
}}
public class Studentscore
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the name of the student");
String str=sc.nextLine();
Student a=new Student(str);
a.printStudent();
System.out.println(a.toString());
System.out.println("Enter the name of the student");
String str1=sc.nextLine();
Student b=new Student(str1);
b.printStudent();
System.out.println(b.toString());
b.toString();
}
}