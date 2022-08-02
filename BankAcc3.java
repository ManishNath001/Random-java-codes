public class Addition
{
	int sum;
	double s;
	public Addition(int a, int b)
	{
		sum=a+b;
		System.out.println("Sum of "+a+" and "+b+"= "+sum);
	}
	public Addition(double a, double b)
	{
		s=a+b;
		System.out.println("Sum of "+a+" and "+b+"= "+s);
	}
	public void add(int a, int b)
	{
		sum=a+b;
		System.out.println("Sum of "+a+" and "+b+"= "+sum);
	}
	public void add(double a, double b)
	{
		s=a+b;
		System.out.println("Sum of "+a+" and "+b+"= "+s);
	}
	public static void main(String args[])
	{
		Addition obj1=new Addition(7,3);
		Addition obj2=new Addition(9.45,6.63);
		obj1.add(8,6);
		obj2.add(13.56,17.13);
	}
}