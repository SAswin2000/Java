interface Engine
{ 
void changeGear(int a);
void speedUp(int a);
}
public class Vehicle implements Engine {
int speed;
int gear;
public void speedUp(int a) { 
this.speed=a;
System.out.println("speed"+speed);
} 
public void changeGear(int a) { 
this.gear=a;
System.out.println("gear"+gear);
} 
public static void main(String args[]) {
Vehicle objv=new Vehicle();
objv.changeGear(5);
objv.speedUp(90);
}
}