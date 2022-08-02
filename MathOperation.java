public class MathOperation
{
	int mult, s;
	double m;
	String str;
	public MathOperation(int a, int b)
	{
		mult=a*b;
		System.out.println("Sum of "+a+" and "+b+"= "+mult);
	}
	public MathOperation(double a, double b)
	{
		m=a*b;
		System.out.println("Sum of "+a+" and "+b+"= "+m);
	}
	public MathOperation(String a, String b)
	{
		str=a+b;
		System.out.println("Sum of "+a+" and "+b+"= "+str);
	}
	public MathOperation(char a, char b)
	{
		s=a+b;
		System.out.println("Sum of "+a+" and "+b+"= "+s);
	}
 	public static void main(String args[])
	{
		MathOperation obj1=new MathOperation(7,3);
		MathOperation obj2=new MathOperation(9.45,6.63);
		MathOperation obj3=new MathOperation("Manish ","Nath");
		MathOperation obj4=new MathOperation('M','N');
	}
}