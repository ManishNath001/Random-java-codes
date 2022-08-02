abstract class Abstract1
{
	abstract void meth1();
}

class Child_Abs1 extends Abstract1
{
	void meth1()
	{
		System.out.println("\nAbstract method written inside child class.");
	}
}

class Abs1
{
	public static void main(String[] args) 
	{
		Child_Abs1 ca = new Child_Abs1();

		ca.meth1();
	}
}