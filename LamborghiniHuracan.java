class Car
{
   public Car()
   {
	    System.out.println("Class Car");
   }
   public void vehicleType()
   {
	    System.out.println("Vehicle Type: Car");
   }
}
class Lamborghini extends Car
{
   public Lamborghini()
   {
	    System.out.println("Class Lamborghini");
   }
   public void brand()
   {
	    System.out.println("Brand: Lamborghini");
   }
   public void speed()
   {
	    System.out.println("Max: 400Kmph");
   }
}
public class LamborghiniHuracan extends Lamborghini
{

   public LamborghiniHuracan()
   {
	    System.out.println("Lamborghini Model: Huracan");
   }
   public void speed()
   {
	    System.out.println("Max: 500Kmph");
   }
   public static void main(String args[])
   {
    LamborghiniHuracan obj=new LamborghiniHuracan();
	 obj.vehicleType();
	 obj.brand();
	 obj.speed();
   }
}