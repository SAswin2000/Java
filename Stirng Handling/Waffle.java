class Waffle { 
  
    String flavour;
    int price;
    public Waffle(String flavour,int price) 
{ 
        this.flavour = flavour; 
        this.price = price ; 
    } 
public boolean equals(Object o) {    
        if (o == this) { 
             return true; 
        } 
        if (!(o instanceof Waffle)) { 
            return false; 
        }          
Waffle c = (Waffle) o;   
         return Double.compare(flavour, c.flavour) == 0
                && Double.compare(price, c.price) == 0;
}
public String toString()
{
    return "The name of the flavour is " + this.flavour + ". The price of the waffle is " + this.price;
} 
}
// Driver class to test the Complex class 
public class Main { 
  
    public static void main(String[] args) { 
        Waffle w1 = new Waffle(Chocolate,15 ); 
        Waffle w2 = new Waffle(Chocolate,15); 
        System.out.println("w1.toString()");
        System.out.println("w2.toString()");
        if (w1.equals(w2)) { 
            System.out.println("Equal "); 
        } else { 
            System.out.println("Not Equal "); 
        } 
    } 
} 