import java.io.*;
import java.util.*;

class Employee implements Serializable {

    String id;
    String employee_name;
    String date_of_birth;

   void empinput()
{ 
Scanner s = new Scanner(System.in);
System.out.println("Enter the Employee id ");
        this.id = s.next();
System.out.println("Enter the Employee name ");
        this.employee_name = s.next();
System.out.println("Enter the Employee date of birth ");
        this.date_of_birth=s.next();
    }
}

class Mainn {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of customers");
        n=s.nextInt();
Employee[] emp = new Employee[n];
try
{
FileOutputStream file = new FileOutputStream("hello.txt");
ObjectOutputStream output = new ObjectOutputStream(file);
 ArrayList<Employee> empl = new ArrayList<>();
for(int i=0;i<n;i++)
{
emp[i]=new Employee();
emp[i].empinput();
empl.add(emp[i]);
}
output.writeObject(empl);
output.flush();
output.close();         
FileInputStream fileStream = new FileInputStream("hello.txt");
ObjectInputStream input = new ObjectInputStream(fileStream);
ArrayList em = (ArrayList<Employee>) input.readObject();
System.out.println("Enter the customer id to be searched ");
String ab=s.next();
int count=0;
Employee a;
Iterator itr=em.iterator();
first : {
while(itr.hasNext()){
a=(Employee)itr.next();
if(a.id.equals(ab))
{
System.out.println("Found");
System.out.println("The Employee id is "+a.id);
System.out.println("The Employee name is "+a.employee_name);
System.out.println("The Employee dob is "+a.date_of_birth);
count=1;
break first;
}
}
}
if(count==0)
{
System.out.println("Not found");
}
input.close();
output.close(); 
}catch(Exception e)
{
e.printStackTrace();
}
}
}