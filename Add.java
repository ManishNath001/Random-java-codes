public class Add
{
	public void sum(int a, int b)
	{
		int sum=a+b;
		System.out.println("The sum= "+sum);
	}
	public void sum(double a, double b)
	{
		double sum=a+b;
		System.out.println("The sum= "+sum);
	}
	public static void main(String args[])
	{
		Add obj1=new Add();
		obj1.sum(15, 19);
		obj1.sum(15.43, 19.36);
	}
}