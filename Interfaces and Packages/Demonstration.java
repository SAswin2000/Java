import myInterface.SharedConstants;
import java.util.*;
class Demonstration implements SharedConstants {
Scanner sc= new Scanner(System.in);
void choice() {
System.out.print("Enter a string: ");  
String str= sc.nextLine(); 
switch (str) {
case "NO":
System.out.println(NO);
break;
case "YES":
System.out.println(YES);
break;
case "MAYBE":
System.out.println(MAYBE);
break;
case "LATER":
System.out.println(LATER);
break;
case "SOON":
System.out.println(SOON);
break;
case "NEVER":
System.out.println(NEVER);
break;
}
}
public static void main(String args[]) {
Demonstration a = new Demonstration();
a.choice();
}
}