abstract class Abstract2
{
	abstract void meth2(); // abstract method

	void ult_meth() // non-abstract method 
	{
		System.out.println("\nInside non-abstract method, written inside abstract parent class. ");
	}
}

class Child_Abs2 extends Abstract2
{
	void meth2() // implementation of abstract class method
	{
		System.out.println("\nInside abstract method, written inside child class. ");
	}
}
class Abs2
{
	public static void main(String[] args)
	{
		Child_Abs2 ca = new Child_Abs2(); 

		ca.meth2(); // abstract
		ca.ult_meth(); // non-abstract
	}
}