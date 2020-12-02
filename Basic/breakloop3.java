public class breakloop3 {
public static void main (String args[]) {
for(int i=0;i<3;i++) {
System.out.print("Pass"+i+":");
for(int j=0;j<100;j++) {
if(j==10) break; //Terminate the loop if j
System.out.println(j+" ");
}
System.out.println();
}
System.out.println("loop complet.e");
}
}